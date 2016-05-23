package hillel.features.search;

import hillel.steps.serenity.DashBoardPageUser;
import hillel.steps.serenity.LoginPageUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginPageUser loginPageUser;

    @Steps
    public DashBoardPageUser dashBoardPageUser;

    @Test
    public void successfully_login(){
        loginPageUser.goToLoginPage();
        loginPageUser.enterUserName("a.a.piluck2");
        loginPageUser.enterUserPassword("12345");
        loginPageUser.clickLogin();
        dashBoardPageUser.verifyIsOnDashBoardPage();
    }

}
