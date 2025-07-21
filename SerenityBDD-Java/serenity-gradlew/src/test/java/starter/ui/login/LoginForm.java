package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {

    public static Target INPUT_USERNAME = Target.the("user name").locatedBy("//input[@id='username']");
    public static Target INPUT_PASSWORD = Target.the("password").locatedBy("//input[@id='password']");
    public static Target BUTTON_SAVE = Target.the("button save").locatedBy("//button[@class='btn btn-primary']");
}
