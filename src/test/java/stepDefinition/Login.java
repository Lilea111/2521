package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Actions.Action.navigate;
import static Actions.Action.sendKey;
import static Actions.Action.click;
import static Actions.Action.isDisplayed;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HighLightElement.highlightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntill.*;

public class Login extends AbstractStepDef {
    @Given("user insert username{string}")
    public void userInsertUsername(String nume) throws InterruptedException {
        navigate(loghinPageUrl, driver);
        waitUntil(1);
        sendKey(logingPage.getUsernamefield(), nume);
        saveData(USERNAME, nume);
    }

    @And("user insert password{string}")
    public void userInsertpassword(String pass) throws InterruptedException {
        sendKey(logingPage.getPasswordField(), "admin123");
        isDisplayed(logingPage.getLoginLogo());
        waitUntil(1);
        saveData(PASSWORD, pass);
    }

    @When("user clicks on Login button")
    public void userClicksOnloginButton() {
        click(logingPage.getSubmitButton(), 2);
        waitUntil(1);
    }

    @Then("user click on Admin page")
    public void userIsRedirectedToHomepage1() {
        click(homepage.getAdminButton(), 2);
        waitUntil(3);
        Assert.assertEquals("Admin", homepage.getAdminButton().getText());
    }
    @And ("user click on Username")
    public void Username() {
        sendKey(homepage.getUsername(), "Admin");
        waitUntil(3);
    }

    @And("user click on search Button")
    public void searchButton(){
        click(homepage.getSearchButton(), 1);
        waitUntil(2);
    }

    @Then("user is redirected to homepage")
    public void userIsRedirectedToHomepage() {
        waitUntil(3);
        highlightElement(homepage.getDashboardSign());
        waitUntil(3);
        Assert.assertEquals("Dashboard", homepage.getDashboardSign().getText());
    }

    @And("user clicks on logout button")
    public void userClickOnlogOutButton() {
        click(homepage.getUsermeniu(), 1);
        highlightElement(homepage.getLogOutButton());
        waitUntil(5);
        click(homepage.getLogOutButton(), 1);
        waitUntil(4);
    }

    @And("user insert invalid credentials")
    public void userInvalidCredential() {
        waitUntil(2);
        Assert.assertEquals("Invalid credentials",logingPage.getInvalidCredentials().getText());
        highlightElement(logingPage.getInvalidCredentials());
    }

    @And("insert username")
    public void insertUsername() {
        waitUntil(3);
        sendKey(logingPage.getUsernamefield(), getData(USERNAME).toString());
    }

    @And("insert password")
    public void inserPassword() {
        waitUntil(3);
        sendKey(logingPage.getPasswordField(), getData(PASSWORD).toString());
    }
    @And("user edit needed information")
    public void editMessage() {
        click(homepage.getEditButton(),1);
        waitUntil(2);
        click(logingPage.getEmployeeName(),1);
        sendKey(logingPage.getEmployeeName(),"20");
        waitUntil(2);


    }
    @And("user clicks on save button")
    public void userClickOnSaveButton(){
        click(homepage.getSaveButton(),2);
        waitUntil(2);
    }

    @And("user insert invalid credential1")
    public void userInvalidCredential1() {
        Assert.assertEquals("Invalid",logingPage.getInvalid().getText());
        waitUntil(2);
        highlightElement(logingPage.getInvalid());
        waitUntil(2);
    }
}
