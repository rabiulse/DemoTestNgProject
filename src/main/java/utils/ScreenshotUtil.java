package utils;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {
	public static void captureScreenshot(WebDriver driver, String testName) {

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File("./Screenshots/" + testName + ".png");

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot saved: " + destination.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
