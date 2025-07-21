package starter.ui.registration;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {

    public static Target INPUT_NAME = Target.the("input name").locatedBy("//input[@id='name']");
    public static Target INPUT_LASTNAME = Target.the("input lastname").locatedBy("//input[@id='last-name']");
    public static Target INPUT_AGE = Target.the("input age").locatedBy("//input[@id='age']");
    public static Target SELECT_COUNTRY = Target.the("select country").locatedBy("//select[@id='country']");
    public static Target CHECK_GENDER = Target.the("check gender").locatedBy("//input[@id='sex-m']");
    public static Target INPUT_EMAIl = Target.the("input email").locatedBy("//input[@id='email']");
    public static Target RADIO_MONDAY = Target.the("radio monday").locatedBy("//input[@id='monday']");
    public static Target RADIO_THURSDAY = Target.the("radio monday").locatedBy("//input[@id='thursday']");
    public static Target INPUT_PICTURE = Target.the("input picture").locatedBy("//input[@id='picture']");
    public static Target BUTTON_SAVE = Target.the("button save").locatedBy("//button[@id='save-btn']");
    public static Target LABEL_ALERT = Target.the("alert fields required").locatedBy("//div[@class='alert alert-danger']");
}