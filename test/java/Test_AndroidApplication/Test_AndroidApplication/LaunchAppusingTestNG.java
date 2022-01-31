package Test_AndroidApplication.Test_AndroidApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class LaunchAppusingTestNG {
	DesiredCapabilities dc;
	URL url;
	AndroidDriver ad;
	
	
	@BeforeTest
	public void testSetup() throws MalformedURLException {
		 dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("deviceName", "Pixel 2 API 28");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("app","//Users//varsha.cn//Downloads//Android_V0.8.8_Test_Build.apk");
		dc.setCapability("newCommandTimeout", "120");

		 url = new URL("http://127.0.0.1:4723/wd/hub");
		 ad = new AndroidDriver(url, dc);

		
		
	}
	
	@Test
	public void launchapp() throws InterruptedException {
		
		Thread.sleep(4000);
		System.out.println("its done!!");
	}
	
	
	@AfterTest
	public void tearDown() {
		
		ad.quit();
	}
	
}
