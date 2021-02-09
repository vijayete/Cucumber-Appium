package Appium.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class AppTest {
	protected static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
//	    chromeCaps(capabilities);
		appCaps(capabilities);
		sum();
	}

	private static void chromeCaps(DesiredCapabilities capabilities) {
		capabilities.setCapability("noReset", false);
//	    capabilities.setCapability("platformName","Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	}

	private static void appCaps(DesiredCapabilities capabilities) throws MalformedURLException {
		File appDir = new File("E:/Testing/Appium");
		File app = new File(appDir, "Calculator_Calculator2.apk");
		capabilities.setCapability("device", "Android");

//		    capabilities.setCapability("deviceId", "MobileDevice ID"); 
		capabilities.setCapability("deviceId", "MobileIP Address");

		capabilities.setCapability("noReset", true);
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("deviceName", "Android");

		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	private static void sum() {
		// TODO Auto-generated method stub
		WebElement element1 = driver.findElement(By.id("com.coloros.calculator:id/digit_8"));
		element1.click();

		WebElement element2 = driver.findElement(By.id("com.coloros.calculator:id/op_add"));
		element2.click();

		WebElement element3 = driver.findElement(By.id("com.coloros.calculator:id/digit_9"));
		element3.click();

		WebElement element4 = driver.findElement(By.id("com.coloros.calculator:id/eq"));
		element4.click();

	}

}