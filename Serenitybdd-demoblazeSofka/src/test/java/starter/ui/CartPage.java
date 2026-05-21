package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static Target BUTTON_PLACE_ORDER = Target.the("Button place order").locatedBy("//button[@class='btn btn-success']");
    public static Target LABEL_FIRST_PRODUCT = Target.the("Label first product").locatedBy("//tr[@class='success' and contains(., 'Sony vaio i5')]");
    public static Target LABEL_SECOND_PRODUCT = Target.the("Label second product").locatedBy("//tr[@class='success' and contains(., 'Apple monitor 24')]");
    public static Target INPUT_NAME = Target.the("Input name").locatedBy("//input[@id='name']");
    public static Target INPUT_COUNTRY = Target.the("Input country").locatedBy("//input[@id='country']");
    public static Target INPUT_CITY = Target.the("Input city").locatedBy("//input[@id='city']");
    public static Target INPUT_CARD = Target.the("Input card").locatedBy("//input[@id='card']");
    public static Target INPUT_MONTH = Target.the("Input month").locatedBy("//input[@id='month']");
    public static Target INPUT_YEAR = Target.the("Input year").locatedBy("//input[@id='year']");
    public static Target BUTTON_PURCHASE = Target.the("Button purchase").locatedBy("//button[@onclick='purchaseOrder()']");
    public static Target BUTTON_CONFIRM = Target.the("Button confirm").locatedBy("//button[@class='confirm btn btn-lg btn-primary']");
    public static Target INFO_PURCHASE = Target.the("Purchase info").locatedBy("//p[@class='lead text-muted ']");
    public static Target MESSAGE_PURCHASE_SUCCESS = Target.the("Message purchase success").locatedBy("//h2[text()='Thank you for your purchase!']");
}
