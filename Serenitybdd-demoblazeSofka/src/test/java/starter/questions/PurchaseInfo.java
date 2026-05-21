package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.ui.CartPage;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseInfo {

    public static Question<String> getInfo() {
        return Question.about("Purchase info").answeredBy(
            actor -> Text.of(CartPage.INFO_PURCHASE).answeredBy(actor)
        );
    }

    public static Question<String> getMessageSuccess() {
        return Question.about("Purchase success message").answeredBy(
            actor -> Text.of(CartPage.MESSAGE_PURCHASE_SUCCESS).answeredBy(actor)
        );
    }    

}
