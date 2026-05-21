package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.ui.CartPage;
import net.serenitybdd.screenplay.questions.Text;

public class NameProductsCart {

    public static Question<String> getFirstNameProducts() {
        return Question.about("Name of products in cart").answeredBy(
            actor -> Text.of(CartPage.LABEL_FIRST_PRODUCT).answeredBy(actor)
        );
    }

    public static Question<String> getSecondNameProducts() {
        return Question.about("Name of products in cart").answeredBy(
            actor -> Text.of(CartPage.LABEL_SECOND_PRODUCT).answeredBy(actor)
        );
    }

}
