package starter.task.registration;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.registration.RegisterForm;

public class DoNotSendInformationRequired implements Task {

    private  final String name;
    private  final String lastName;
    private  final String age;

    public DoNotSendInformationRequired(String name, String lastname, String age){
        this.name=name;
        this.lastName=lastname;
        this.age= age;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(name).into(RegisterForm.INPUT_NAME),
                Enter.theValue(lastName).into(RegisterForm.INPUT_LASTNAME),
                Enter.theValue(age).into(RegisterForm.INPUT_AGE),
                Click.on(RegisterForm.BUTTON_SAVE)
        );
    }
}
