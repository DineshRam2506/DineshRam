package myFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[1]/a")
	private WebElement tabwomens;
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement tabdresses;
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
	private WebElement tabtshirts;
	
	@FindBy(xpath="//*[@id=\'newsletter-input\']")
	private WebElement mail;
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement tabmail;
	public HomePageObject()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickwomens()
	{
		tabwomens.click();
	}
	public void clickdresses()
	{
		tabdresses.click();
	}
	public void clicktshirts()
	{
		tabtshirts.click();
	}
	
	public void mail()
	{
		mail.sendKeys("dinehram2506@gmail.com");
	}
	
	public void clickmail()
	{
		tabmail.click();
	}
	
}
