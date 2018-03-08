package utils.common;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Parameters;

import utils.config.ModuleFactory;
import utils.helper.PropertiesHelper;

import com.logigear.driver.DriverProperty;
import com.logigear.driver.DriverUtils;
import com.logigear.helper.BrowserSettingHelper;

@Guice(modules = ModuleFactory.class)
public class TestBase {

	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(String browser, Method method) throws Throwable {
		String trelloURL = PropertiesHelper.getPropValue("profile.url");
		DriverProperty property = BrowserSettingHelper.getDriverProperty(
				Constants.BROWSER_SETTING_FILE, browser, method.getName());
		DriverUtils.getDriver(property);
		DriverUtils.setWaitForAjax(false);
		DriverUtils.maximizeBrowser();
		DriverUtils.navigate(trelloURL);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult tr) {
		DriverUtils.quitBrowser(tr.isSuccess());
	}

}
