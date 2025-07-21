package starter.ui.addtransactions;

import net.serenitybdd.screenplay.targets.Target;

public class AddTransactionForm {

    public static Target BUTTON_ADD_TRANSACTION = Target.the("button add transaction").locatedBy("//button[@data-target='#transactionModal']");
    public static Target INPUT_DATE = Target.the("date transaction").locatedBy("//input[@id='date']");
    public static Target INPUT_MOUNT = Target.the("amount transaction").locatedBy("//input[@id='amount']");
    public static Target INPUT_DESCRIPTION = Target.the("description transaction").locatedBy("//input[@id='description']");
    public static Target BUTTON_SAVE = Target.the("button save transaction").locatedBy("//button[@class='btn btn-primary']");
    public static Target TABLE_TRANSACTION = Target.the("Description transaction").locatedBy("//tbody[@id='transactions-list']");

    public static String TRANSACTION_TABLE_XPATH = "//tbody[@id='transactions-list']";
}
