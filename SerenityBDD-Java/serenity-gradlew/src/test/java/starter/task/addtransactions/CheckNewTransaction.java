package starter.task.addtransactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.questions.GetTransactionInfo;
import starter.ui.addtransactions.AddTransactionForm;

public class CheckNewTransaction{


    public static Performable checkInfo(String description){
        return Task.where("{0} add a new transaction",
                Ensure.that(GetTransactionInfo.getDescription()).contains(description)
        );
    }

}
