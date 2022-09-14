import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	
@FindBy(xpath="//input[@label='User ID']")private WebElement UN;
@FindBy(xpath="//input[@type='password']")private WebElement PWD;
@FindBy(xpath="//button[@type='submit']")private WebElement Butn;

//step 2 initialization
public Pom1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//step 3utilization
public void enterUN(String username )
{
	UN.sendKeys(username);
}
public void enterPWD(String password) {
	PWD.sendKeys(password);
}
public void clickLogin()
{
	Butn.click();
}

}
