package Test_AndroidApplication.Test_AndroidApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SetupAppAutomationPart1 {
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("deviceName", "Pixel 2 API 28");
		// dc.setCapability("deviceName", "Pixel 2 API 28");

		dc.setCapability("automationName", "Appium");
		// dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

//		dc.setCapability(CapabilityType.VERSION, "69");

		dc.setCapability("app", "//Users//varsha.cn//Downloads//Android_V0.8.8_Test_Build.apk");
		dc.setCapability("newCommandTimeout", "220");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver ad = new AndroidDriver(url, dc);

		Thread.sleep(5000);
		ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(1000);

		ad.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]"))
				.click();

	}
}
