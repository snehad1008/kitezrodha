//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base1{
	Pom1 login1;
	Pom2 login2;
	Pom3 login3;

	@BeforeClass 
	public void openBrowser() {
	
		initilizeBrowser();
		login1=new Pom1(driver);
	 login2=new Pom2(driver);
	login3=new Pom3(driver);
	}	
	@BeforeMethod
	public void loginToApp() throws Throwable
	{
		login1.enterUN(Utility.getTD(0, 0));
		login1.enterPWD(Utility.getTD(0, 1));
		login1.clickLogin();
		
		login2.enterPIN(Utility.getTD(0, 2));
		login2.CtnBtn();
	}
	@Test
	public void verifyuserID() throws Throwable
	{
		Reporter.log("Running for verify user id",true);
		String actID=login3.verifyUserId();
		String expID=Utility.getTD(0, 0);
		Assert.assertEquals(expID,actID,"both are different tc is failed");
	}
	@AfterMethod
public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close the application",true);
	}
}