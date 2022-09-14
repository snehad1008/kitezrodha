import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
//step 1 Decleration
	@FindBy(xpath="//input[@type='password']")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement cntBtn;
	
	//step 2 initilization
	public Pom2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step 3Utilization
	public void enterPIN(String pinvalue)
	{
		PIN.sendKeys("171992");
	}
	public void CtnBtn()
	{
		cntBtn.click();
	}
}
