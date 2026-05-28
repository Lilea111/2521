package Actions;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Util.CreationFolderIfNotExist.createDirectoryIfNotExists;

public class Action {
    public static void isDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public static void sendKey(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void click(WebElement element, Integer timeToWaitInSeconds) {
        try {
            Thread.sleep(timeToWaitInSeconds * 1000);
            element.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void navigate(String navigateTo, WebDriver driver) {
        driver.get(navigateTo);
    }

    public static void takeScreenshot(Scenario scenario, WebDriver driver) {
        try {
            String screenshotName = generateScreenshotName(scenario.getName());
            String directoryname = "target/screenshots/";
            createDirectoryIfNotExists(directoryname);
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(directoryname + screenshotName + ".pdg"));
        } catch (Exception e) {
            System.out.println("Screenshot nu lucreaza " + e);
        }
    }

    private static String generateScreenshotName(String scenarioname) {
        LocalDateTime currentime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH-mm-ss");
        String timestamp = currentime.format(formatter);
        return scenarioname.replaceAll("[^a-zA-Z0-9_-]", "_") + "_" + timestamp;
    }
}
