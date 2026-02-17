package Test;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.checkbox;

public class CheckboxTest extends BaseTest {
	
	@Test
    public void VerifyCheckBox() {

		checkbox checkbox = new checkbox(driver);
		checkbox.clickCheckBox();
		checkbox.clickfirstcheckbox();

        // Add assertion here
        System.out.println("Checkbox Test Executed");
	}

}
