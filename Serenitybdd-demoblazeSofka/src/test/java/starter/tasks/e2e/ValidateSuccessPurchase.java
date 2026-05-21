package starter.tasks.e2e;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.PurchaseInfo;
import starter.ui.CartPage;

public class ValidateSuccessPurchase implements Task{
    
    private String message;
    private String numberCard;
    private String name;

    public ValidateSuccessPurchase(String message, String numberCard, String name) {
        this.message = message;
        this.numberCard = numberCard;
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ensure.that(PurchaseInfo.getMessageSuccess()).contains(this.message),
            Ensure.that(PurchaseInfo.getInfo()).contains("Card Number: " + this.numberCard),
            Ensure.that(PurchaseInfo.getInfo()).contains("Name: " + this.name),
            Click.on(CartPage.BUTTON_CONFIRM)
        );
    }
}
