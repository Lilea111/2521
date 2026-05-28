package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage {
    @FindBy (xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSign;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    private WebElement usermeniu;

    @FindBy(xpath = "(//a[@role='menuitem'])[4]")
    private WebElement logOutButton;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminButton;
    @FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement Username;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath ="//input[@placeholder='Type for hints..']")
    public WebElement t;

    @FindBy (xpath ="(//button[@type='button'])[8]")
    public WebElement editButton;

    @FindBy (xpath ="//button[@type='submit']")
    public WebElement saveButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
