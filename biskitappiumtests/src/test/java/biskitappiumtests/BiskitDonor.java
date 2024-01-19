package biskitappiumtests;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import java.net.*;

public class BiskitDonor {
	
	static AppiumDriver driver;
	

	public static void main(String[] args) {
		try {
			openBiskitDonorApp();
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();


		}

	}
	
	public static void openBiskitDonorApp() {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName","Infinix HOT 30");
	cap.setCapability("udid", "099344035A001737");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "13");
	cap.setCapability("appPackage", "com.biskitdonorlocal-0.0.1");
	cap.setCapability("appActivity", "com.biskitdonor.MainActivity");
	
	URL url = null;
	try {
		url = new URL("http://127.0.0.1:4723/wd/hub");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver = new AppiumDriver(url,cap);
	
	System.out.println("Application started");
	}

}
