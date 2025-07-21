package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.registration.RegisterForm;

import java.net.URISyntaxException;

public class RegisterUser implements Task {

    private final String name;
    private final String lastName;
    private final String age;
    private final String email;
    private final  String country;

    public RegisterUser(String name, String lastName, String age, String email, String country){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.email=email;
        this.country=country;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Enter.theValue(name).into(RegisterForm.INPUT_NAME),
                    Enter.theValue(lastName).into(RegisterForm.INPUT_LASTNAME),
                    Enter.theValue(age).into(RegisterForm.INPUT_AGE),
                    SelectFromOptions.byVisibleText(country).from(RegisterForm.SELECT_COUNTRY),
                    Click.on(RegisterForm.CHECK_GENDER),
                    Enter.theValue(email).into(RegisterForm.INPUT_EMAIl),
                    Click.on(RegisterForm.RADIO_MONDAY),
                    Click.on(RegisterForm.RADIO_THURSDAY),
                    Upload.theClasspathResource("pictures/america.png").to(RegisterForm.INPUT_PICTURE),
                    Click.on(RegisterForm.BUTTON_SAVE)
            );
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
