package hillel.steps.serenity;

import hillel.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageUser extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void goToLoginPage(){
        loginPage.open();
    }

    @Step
    public void enterUserName(String userName){
        loginPage.enterUserName(userName);
    }

    @Step
    public void enterUserPassword(String password){
        loginPage.enterUserPassword(password);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }
}
