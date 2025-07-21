package starter.task.addtransactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.addtransactions.AddTransactionForm;

public class AddTransaction implements Task {

    String date;
    String amount;
    String description;

    public AddTransaction(String date, String amount, String description){
        this.date=date;
        this.amount=amount;
        this.description=description;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddTransactionForm.BUTTON_ADD_TRANSACTION),

                Enter.theValue(date).into(AddTransactionForm.INPUT_DATE),
                Enter.theValue(amount).into(AddTransactionForm.INPUT_MOUNT),
                Enter.theValue(description).into(AddTransactionForm.INPUT_DESCRIPTION),
                Click.on(AddTransactionForm.BUTTON_SAVE)
        );
    }
}
