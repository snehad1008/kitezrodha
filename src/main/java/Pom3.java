import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
//step 1 decleration
	@FindBy(xpath="//span[@class='user-id']")private WebElement UID;
	
	//step 2 linltiliazation
	
	public Pom3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step 3utilization
	public String verifyUserId()
	{
		String actId=UID.getText();
		return actId;
	}
}
