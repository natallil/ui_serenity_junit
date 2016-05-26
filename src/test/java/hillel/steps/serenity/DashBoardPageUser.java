package hillel.steps.serenity;


import hillel.pages.CreateIssuePage;
import hillel.pages.DashBoardPage;
import hillel.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class DashBoardPageUser extends ScenarioSteps {

    DashBoardPage dashBoardPage;
    HeaderPage headerPage;
    CreateIssuePage createIssuePage;

    @Step
    public void verifyIsOnDashBoardPage(){
        assertEquals(dashBoardPage.isOnDashBoardPage(), "System Dashboard");
    }

    @Step
    public void clicksOnCreateNewIssue(){
        headerPage.clickCreate();
    }

    @Step
    public void entersIssueType(String issueType){
        createIssuePage.enterIssueType(issueType);
    }

    @Step
    public void entersSummary(String issueSummary){
        createIssuePage.enterIssueSummary(issueSummary);
    }

    @Step
    public void clicksOnSubmit(){
        createIssuePage.clickOnCreateIssue();
    }
}
