package utils.config;

import java.io.File;
import java.util.UUID;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utils.common.Common;
import utils.helper.Logger;

import com.logigear.driver.DriverUtils;

public class TestListener implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String path = DriverUtils.captureScreenshot(UUID.randomUUID()
				.toString(), "screenshots");

		String script = Common.screenshotURI(path);
		Reporter.log(script);
		new File(path).delete();
	}

	public void onTestStart(ITestResult result) {
		Logger.info(String.format("TEST CASE: %s.%s", result.getTestClass()
				.getName(), result.getName()));
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
