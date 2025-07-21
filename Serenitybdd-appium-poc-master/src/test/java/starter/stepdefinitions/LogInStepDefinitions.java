package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.LoggedQuestions;
import starter.task.CheckLogged;
import starter.task.Login;
import starter.task.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("John Wick wants to create a new post")
    public void john_want_to_create_a_new_post() {
        theActorCalled("Jhon").attemptsTo(
                new NavigateTo()
        );
    }

    @When("he sends his credentials")
    public void he_sends_credentials() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("he should see the dashboard")
    public void he_should_dashboard() {
        String welcomeText = "You are logged in as alice";
        theActorInTheSpotlight().should(
                seeThat("the welcome text", LoggedQuestions.value(),equalTo(welcomeText))
        );
    }

    @Then("he should see the dashboardII")
    public void he_should_dashboardII() {
        String welcomeText = "You are logged in as alice";
        theActorInTheSpotlight().attemptsTo(
                CheckLogged.checkInfo(welcomeText)
        );
    }
}
