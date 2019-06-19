package Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress;
	@FindBy(id="newsletter-input")
	private WebElement MiTextboxAd;
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement submitbutton;
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement MiVerification;

	
	
	

     public void setnewletter(String email) {
    	 setText(MiTextboxAd, email);
    	 submitbutton.click();
     }

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement words() {
		return dress;
	}
	public String MsgSuccess() {
		return MiVerification.getText();
		
	}

	
	
	}
	


	