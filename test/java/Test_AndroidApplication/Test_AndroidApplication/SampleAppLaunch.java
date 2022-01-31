package Test_AndroidApplication.Test_AndroidApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class SampleAppLaunch {

	public static void main(String args[]) throws MalformedURLException, InterruptedException {


		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("deviceName", "Pixel 2 API 28");
		//dc.setCapability("deviceName", "Pixel 2 API 28");

		dc.setCapability("automationName", "Appium");
		//dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

//		dc.setCapability(CapabilityType.VERSION, "69");

		dc.setCapability("app","//Users//varsha.cn//Downloads//Android_V0.8.8_Test_Build.apk");
		dc.setCapability("newCommandTimeout", "120");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver ad = new AndroidDriver(url, dc);
	
	//	ad = new AndroidDriver(url, dc);
	//	ad.get("https://www.amazon.in/");
		Thread.sleep(4000);
		//ad.quit();
	}
}
