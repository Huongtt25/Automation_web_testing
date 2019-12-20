package edumall.features.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import edumall.pages.LoginFacebookPage;
import edumall.steps.serenity.HomeStep;
import edumall.steps.serenity.LoginFaceSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
@RunWith(SerenityRunner.class)
public class LoginFace {
	
	  private static final String String = null;
	  @Managed
	  WebDriver webdriver;
	  @Steps
	  HomeStep home;
	  @Steps
	  LoginFaceSteps login_face;
	  @Test
	  public void DangNhap() {
		 String taikhoan="Truong Huong";
		 home.openEdumall();
		 home.Click_linkDangnhap();
		 login_face.ClickBTNFacebook();
		 login_face.enterinfo("huongbebk@gmail.com","diepbong135a@");
		 login_face.ClickonDangNhap();
		 home.loginsucess (taikhoan);
	  }
	  

	  

}
