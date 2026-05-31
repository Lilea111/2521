package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class LoginPage extends AbstractPage {
//     Locators for login page elements using @FindBy
    @FindBy (name = "username")
    private WebElement usernamefield;
    @FindBy (name = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//p[text()='Time at work']")
    private WebElement timeAtWorkText;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement invalidCredentials;
    
    @FindBy(xpath = "//img[@alt='company-branding']")
    private WebElement loginLogo;

    @FindBy(xpath = "//button[@type='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()='Invalid']")
    private WebElement EditUser;

//    public LoginPage(WebDriver driver) {
//        super(driver); //Call the constructor of the AbstractPage
//    }
    @FindBy(xpath = "//span[text()='Username']]")
    private WebElement usernamefield1;

    @FindBy(xpath = "//button[@type='Search']")
    private WebElement searchButton;

    @FindBy(xpath ="//input[@placeholder='Type for hints...']")
    private WebElement EmployeeName;

    @FindBy(xpath = "//p[class='Forgot your password']")
    private WebElement resetPassword;

    @FindBy(xpath = "//span[text()='Invalid']")
    private WebElement Invalid;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}

