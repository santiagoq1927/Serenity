package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.net.URISyntaxException;

public class RegistrationStepDefinitions {

        String name = "Santiago";
        String lastName = "Quijano";
        String age="28";
        String email = "santiago@gmail.com";
        String country = "Colombia";
        String pathPicture = "pictures/america.png";

        String inpName = "//input[@id='name']";
        String inpLastName = "//input[@id='last-name']";
        String inpAge= "//input[@id='age']";
        String selCountry = "//select[@id='country']";
        String rdbGender = "//input[@id='sex-m']";
        String inpEmail = "//input[@id='email']";
        String chkMonday = "//input[@id='monday']";
        String chkThursday = "//input[@id='thursday']";
        String btnUploadPicture = "//input[@id='picture']";
        String btnSave = "//button[@id='save-btn']";
        String txtNameParagraph = "//strong[contains(text(),'Nombre')]/parent::p";
        String txtLastNameParagraph = "//strong[contains(text(),'Apellido')]/parent::p";

    @Given("{actor} wants to sign up in application")
    public void wantsToSignUpInTheApplication(Actor actor){

        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/registration/register.html")
        );
    }

    @When("{actor} sends the required information to sign up")
    public void enterInformation(Actor actor) throws URISyntaxException{

        actor.attemptsTo(
                Enter.theValue(name).into(inpName),
                Enter.theValue(lastName).into(inpLastName),
                Enter.theValue(age).into(inpAge),
                SelectFromOptions.byVisibleText(country).from(selCountry),
                Click.on(rdbGender),
                Enter.theValue(email).into(inpEmail),
                Click.on(chkMonday),
                Click.on(chkThursday),
                Upload.theClasspathResource(pathPicture).to(Target.the("america picture")
                        .locatedBy(btnUploadPicture)),
                Click.on(btnSave) 
        );
    }

    @Then("{actor} should have a new account created")
    public void validateAccountCreated(Actor actor){

        actor.attemptsTo(
                Switch.toWindowTitled("Summary"),
                Ensure.that(Target.the("Name element").locatedBy(txtNameParagraph)).text().containsIgnoringCase(name),
                Ensure.that(Target.the("LastName element").locatedBy(txtLastNameParagraph)).text().containsIgnoringCase(lastName)   
        );

    }


}
