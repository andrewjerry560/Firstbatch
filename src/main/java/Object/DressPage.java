package Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage extends BasePage {
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement PrintedDress;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress;

	@FindBy(id = "category")
	private WebElement SMshare;

	public DressPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickpd() {
		PrintedDress.click();
	}

	public void ClickDress() {
		dress.click();
	}
	public WebElement SmMessage() {
		return SMshare;
	}

}
