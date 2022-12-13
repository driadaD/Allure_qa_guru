package qa.guru.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static qa.guru.allure.StepsTest.ISSUENUM;
import static qa.guru.allure.StepsTest.REPOSITORY;

public class StepsTestAnnotated {

    WebStepsTest steps = new WebStepsTest();

    @Test
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithText(ISSUENUM);
    }
}
