package hillel.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class DashBoardPage  extends PageObject {

    @FindBy(xpath = "//*[@class='aui-page-header-main']//h1")
    private WebElementFacade pageHeader;

    public String isOnDashBoardPage(){
       return pageHeader.getText();
    }
}
