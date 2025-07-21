package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.task.registration.CheckNewAccountCreated;
import starter.task.registration.DoNotSendInformationRequired;
import starter.task.registration.RegisterUser;
import starter.task.registration.ShouldlFieldsRequiered;
import starter.ui.registration.RegisterPage;

import java.net.URISyntaxException;
import java.util.List;

public class RegistrationStepDefinitions {

    String name = "";
    String lastName = "";
    String age="";
    String email = "";
    String country = "";
    String pathPicture = "pictures/america.png";

    String txtFailEnterInformation = "Por favor diligencie todos los campos";


    /*@Given("{actor} wants to sign up in application")
    public void wantsToSignUpInTheApplication(Actor actor) throws URISyntaxException {
        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/registration/register.html"),
                new RegisterUser(name,lastName,age,email,country),

                Switch.toWindowTitled("Summary"),
                Ensure.that(Target.the("Name element").locatedBy(txtNameParagraph)).text().containsIgnoringCase(name),
                Ensure.that(Target.the("LastName element").locatedBy(txtLastNameParagraph)).text().containsIgnoringCase(lastName)
        );
    }*/

    @Given("{actor} wants to sign up in application but fail in required information")
    public void failRequiredInformation(Actor actor){
        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/registration/register.html"),
                new DoNotSendInformationRequired(name,lastName,age),
                new ShouldlFieldsRequiered(txtFailEnterInformation)
        );
    }

    @Given("{actor} wants to sign up in application")
    public void wantsToSignUpInTheApplication(Actor actor) throws URISyntaxException {
        actor.attemptsTo(
                Open.browserOn(new RegisterPage())
        );
    }

    @When("{actor} sends the required information to sign up")
    public void sendsRequiredInformation(Actor actor, DataTable userInfo) throws URISyntaxException {

        List<List<String>> rows = userInfo.asLists(String.class);

        for(List<String> columns: rows){
            name=columns.get(0);
            lastName=columns.get(1);
            age=columns.get(2);
            email=columns.get(3);
            country=columns.get(4);
        }

        actor.attemptsTo(
                new RegisterUser(name,lastName,age,email,country),
                new CheckNewAccountCreated(name,lastName)
        );
    }

    @Then("{actor} should have a new account created")
    public void validateAccountCreated(Actor actor)throws URISyntaxException{

        actor.attemptsTo(

        );

    }
}
