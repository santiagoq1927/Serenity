package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.registration.RegisterForm;

public class ShouldlFieldsRequiered implements Task {

    private final String txtFailEnterInformation;

    public ShouldlFieldsRequiered(String txtFailEnterInformation){
        this.txtFailEnterInformation = txtFailEnterInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(RegisterForm.LABEL_ALERT).text().containsIgnoringCase(txtFailEnterInformation)

        );
    }
}
