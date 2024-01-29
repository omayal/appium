package AndroidUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidUtility {
static AndroidDriver driver;
	public static void InitializeApk(String appPath) {
		// TODO Auto-generated method stub
		  DesiredCapabilities cap =new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("automationName", "uiautomator2");
	        cap.setCapability("deviceName", "myDevice");
	        cap.setCapability("appPath", appPath);
	        
	        try {
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//server is running in IP 
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	public static void InitializeApp(String appPackage, String appActivity) {
		// TODO Auto-generated method stub
		  DesiredCapabilities cap =new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("automationName", "uiautomator2");
	        cap.setCapability("deviceName", "myDevice");
	        cap.setCapability("appPackage",appPackage);
	        cap.setCapability("appActivity", appActivity);
	        
	        try {
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//server is running in IP 
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public static void InitializeBrowser(String BrowserName) {
		// TODO Auto-generated method stub
		  DesiredCapabilities cap =new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("automationName", "uiautomator2");
	        cap.setCapability("deviceName", "myDevice");
	        cap.setCapability("BrowserName", BrowserName);
	        
	        try {
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public static void click(By androidUIAutomator) {
		// TODO Auto-generated method stub
		driver.findElement(androidUIAutomator).click();
	}

	public static void sendKeys(By androidUIAutomator,String val) {
		// TODO Auto-generated method stub
		driver.findElement(androidUIAutomator).sendKeys(val);
	}
	public static String getText(By androidUIAutomator)
	{
		String errorMessage = driver.findElement(androidUIAutomator).getText();
		return errorMessage;
		
	}
	@SuppressWarnings("deprecation")
	public static void swipeTo(By androidUIAutomator)
	{
		Dimension d = driver.manage().window().getSize();
		AndroidTouchAction act1=new AndroidTouchAction((PerformsTouchActions) driver);
		while(driver.findElements(AppiumBy.androidUIAutomator("text(\"Class 12 math (India)\")")).size()==0)  //it will find all the elements in the page with the text -if its does not find or size is zero it will get inside the loop
		{
		
		act1.longPress(PointOption.point(d.width/2,3*d.height/4)).moveTo(PointOption.point(d.width/2, d.height/4)).release().perform();
		}
		driver.findElement(AppiumBy.androidUIAutomator("text(\"Class 12 math (India)\")")).click();
		
	}

		
	}
	
	


