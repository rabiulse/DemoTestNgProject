package Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.javaScriptAlert;

public class BrokenLinkTest extends BaseTest {

	@Test
	public void brokenTest() {

		javaScriptAlert javascriptalert = new javaScriptAlert(driver);
		javascriptalert.brokenLinkTest();
	    System.out.println("BrokenLinkTest Test Executed");

	}

}
