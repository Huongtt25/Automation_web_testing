package edumall.pages;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginFacebookPage extends PageObject {
	private static final String BUTTON_NAME_LOGIN = "//button[@name='login']";
	private static final String PASS_TXT = "//input[@id='pass']";
	private static final String EMAIL_TXT = "//input[@id='email']";
	
	private static final String INFO = "//input[@id='email']";
	@FindBy(xpath="//span[contains(text(),'Facebook')]")
	WebElementFacade BTNFacebook;
	public void ClickBTNFacebook() {
		BTNFacebook.click();
	}
	public void SenkeyEmail(String email) {
		$(EMAIL_TXT).type(email);
	
}
	public void SenkeyPass(String pass) {
		$(PASS_TXT).type(pass);
	
}
	
	public void ClickDangNhap() {
		//$(BUTTON_NAME_LOGIN).w
		$(BUTTON_NAME_LOGIN).click();
}
}
