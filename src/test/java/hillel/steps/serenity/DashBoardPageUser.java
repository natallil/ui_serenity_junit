package hillel.steps.serenity;


import hillel.pages.DashBoardPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class DashBoardPageUser extends ScenarioSteps {
    DashBoardPage dashBoardPage;

    @Step
    public void verifyIsOnDashBoardPage(){
        assertEquals(dashBoardPage.isOnDashBoardPage(), "System Dashboard");
    }

}
