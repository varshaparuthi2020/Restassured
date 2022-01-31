package Test_AndroidApplication.Test_AndroidApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SetupAppAutomationPart3 {
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

		// proceed next functionalities in app
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("deviceName", "Pixel 2 API 28");

		dc.setCapability("automationName", "Appium");

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
		Thread.sleep(2000);
		ad.findElement(By.id("com.sprint.trebl:id/next_btn")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.sprint.trebl:id/next_btn")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.sprint.trebl:id/next_btn")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.sprint.trebl:id/next_btn")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.sprint.trebl:id/next_btn")).click();
		Thread.sleep(1000);
		Dimension dim = ad.manage().window().getSize();

	WebElement accept = ad.findElement(By.id("com.sprint.trebl:id/accept_txt"));
		// int x1 =1;
		while (!(((WebElement) accept).isEnabled())) {
			// for (int i =0;i<accept.size();i++)
			// {
			dim = ad.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			System.out.println("Total height :" + height);
			System.out.println("Total width :" + width);
			int x = width / 2;
			int top_y = (int) (height * 0.66);
			int bottom_y = (int) (height * 0.35);
			System.out.println("coordinates :" + x + "  " + top_y + " " + bottom_y);

			// if(!(accept.get(i).isEnabled())) {
			TouchAction ts = new TouchAction(ad);
			ts.longPress(PointOption.point(0, top_y)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(10)))
					.moveTo(PointOption.point(0, bottom_y)).release().perform();
			if ((((WebElement) accept).isEnabled())) {
				((WebElement) accept).click();
				System.out.println("yayyy its donee!!!!");

				break;
			}
					
		}
		Thread.sleep(4000);
		//performing contune button functionalities
		ad.findElement(By.id("com.sprint.trebl:id/continue_btn")).click();
		Thread.sleep(1000);
		ad.findElement(By.id("com.sprint.trebl:id/continue_btn")).click();
		Thread.sleep(1000);
		ad.findElement(By.id("com.sprint.trebl:id/continue_btn")).click();
		Thread.sleep(1000);

		if(ad.findElement(By.id("com.sprint.trebl:id/content_view")).isDisplayed()){
			System.out.println("Message is :"+ad.findElement(By.id("com.sprint.trebl:id/content_view")).getText());
			Thread.sleep(2000);
			ad.findElement(By.id("com.sprint.trebl:id/ok_text_view")).click();
			System.out.println("connect with trbl plz");

		}

	}

}
