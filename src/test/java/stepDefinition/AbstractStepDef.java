package stepDefinition;
import Page.HomePage;
import Page.LoginPage;
import Util.PropertyLoader;
import org.openqa.selenium.WebDriver;

import java.util.logging.LoggingPermission;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage logingPage = new LoginPage(driver);
    public HomePage homepage= new HomePage(driver);
    //public Admin page adminPage=new AdminPage(driver);
    //public AutoItPage autoItPage=new AutoItPage(driver);
    protected static String chromeDriver= PropertyLoader.loadProperty("chromeDriver");
    protected static String loghinPageUrl=PropertyLoader.loadProperty("loginPageUrl");
//    public static String excelFilePath = PropertyLoader.loadProperty("excelFilePath");
//    public static String excelSheet = PropertyLoader.loadProperty("excelSheet");
//    public static String autoItUploadfileSite = PropertyLoader.loadProperty("autoItUploadfileSite");
//    public static String restAssuredBaseURL = PropertyLoader.loadProperty("restAssuredBaseURL");
//     public Logger log= LogManager.getLogger();
}
