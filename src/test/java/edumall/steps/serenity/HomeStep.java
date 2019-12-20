package edumall.steps.serenity;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import edumall.pages.HomePage;

public class HomeStep {
	HomePage homepage;
	@Step
	public void openEdumall() {
		homepage.open();
	}
	@Step
	public void Click_linkDangnhap() {
		homepage.ClickOnLinkDangNhap();
	}
	@Step
	public void loginsucess(String taikhoan) {
		String Actualresult = homepage.getaccount();
		// verify with junit
		//assertEquals(taikhoan, homepage.getaccount());
		// verify with hamet
		assertThat(taikhoan, equalTo(Actualresult));
		
	}
	

}
