package edumall.steps.serenity;
import net.thucydides.core.annotations.Step;
import edumall.pages.HomePage;
import edumall.pages.LoginFacebookPage;

public class LoginFaceSteps {
	LoginFacebookPage loginFace;
	@Step
	public void ClickBTNFacebook() {
		loginFace.ClickBTNFacebook();
	}
	@Step
	public void enterinfo(String email, String pass) {
		loginFace.SenkeyEmail(email);
		loginFace.SenkeyPass(pass);
	//	loginFace.ClickDangNhap();
		
	}
//	@Step
	public void SendEmail(String email) {
		loginFace.SenkeyEmail(email);
	}
//	@Step
	public void SendPass(String pass) {
		loginFace.SenkeyPass(pass);
	}
	//@Step
	public void ClickonDangNhap() {
		loginFace.ClickDangNhap();
	}
}
