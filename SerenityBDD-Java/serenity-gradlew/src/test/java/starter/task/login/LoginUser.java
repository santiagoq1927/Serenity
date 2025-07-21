package starter.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.login.LoginForm;

public class LoginUser implements Task {

    String username;
    String password;

    public LoginUser(String username, String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.INPUT_USERNAME),
                Enter.theValue(password).into(LoginForm.INPUT_PASSWORD),
                Click.on(LoginForm.BUTTON_SAVE)
        );

    }
}
