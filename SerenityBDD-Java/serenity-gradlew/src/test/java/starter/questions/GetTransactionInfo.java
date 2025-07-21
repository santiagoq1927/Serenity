package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.addtransactions.AddTransactionForm;

public class GetTransactionInfo {

    public static Question<String> getDescription(){
        return Question.about("Transaction description").answeredBy(
            actor -> BrowseTheWeb.as(actor).textOf(AddTransactionForm.TRANSACTION_TABLE_XPATH)
        );
    }
}
