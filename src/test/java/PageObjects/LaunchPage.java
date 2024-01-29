package PageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class LaunchPage {
public static By dismiss = AppiumBy.androidUIAutomator("text(\"Dismiss\")");
public static By signin=By.xpath("//android.widget.TextView[@text=\"Sign in\"]");
public static By userName= By.xpath("//android.widget.EditText[@content-desc=\"Enter an e-mail address or username\"]");
public static By Password =By.xpath("//android.widget.EditText[@content-desc=\"Password\"]");
public static By SigninButton=By.xpath("//android.widget.Button[@content-desc=\"Sign in\"]/android.view.ViewGroup");
public static By errorMessage=By.xpath("//android.widget.TextView[@text=\"There was an issue signing in\"]");

}
