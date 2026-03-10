package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class TestListener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {

		String testName = result.getName();

		WebDriver driver = BaseTest.driver;
		ScreenshotUtil.captureScreenshot(driver, testName);

	}
}
