package edumall.pages;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
	
	@FindBy(xpath="//button[contains(text(),'Đăng nhập')]")
	WebElementFacade LinkDangNhap;
	public void ClickOnLinkDangNhap() {
		LinkDangNhap.click();
	}
	//span[@class='fullname']
	
	@FindBy(xpath="//span[@class='fullname']")
	WebElementFacade taikhoan;

	public String getaccount() {
		return taikhoan.getText();
	}
	
}
