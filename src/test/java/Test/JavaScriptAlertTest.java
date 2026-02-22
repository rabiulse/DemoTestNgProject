package Test;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.javaScriptAlert;

public class JavaScriptAlertTest extends BaseTest {
	@Test
    public void VerifyCheckBox() {

		javaScriptAlert javascriptalert = new javaScriptAlert(driver);
		javascriptalert.clickOnJavaScriptAlert();
        // Add assertion here
        System.out.println("Checkbox Test Executed");
	}
	

}
