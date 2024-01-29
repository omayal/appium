package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LaunchPage;

public class Login  {

	
	@Test(dataProvider="negativeLoginData")
	public void NegativeLogin(String user ,String Pwd)
	{
		AndroidUtility.AndroidUtility.InitializeApp("org.khanacademy.android", "ui.library.MainActivity");
		AndroidUtility.AndroidUtility.click(LaunchPage.dismiss);
		AndroidUtility.AndroidUtility.click(LaunchPage.signin);
		AndroidUtility.AndroidUtility.sendKeys(LaunchPage.userName,user);
		AndroidUtility.AndroidUtility.sendKeys(LaunchPage.Password,Pwd);
		AndroidUtility.AndroidUtility.click(LaunchPage.SigninButton);
		String text = AndroidUtility.AndroidUtility.getText(LaunchPage.errorMessage);
		System.out.println(text);
		
		
	}
	@DataProvider
	public Object[][] negativeLoginData()
	{
		return new Object[][] {
			{"user","pass"},
			{"admin","pass"},
			{"","pass"},
			{"admin",""}
			return ExcelUtility.getData("TestData.xlsx","negativeLogin");
		};
	}
}
