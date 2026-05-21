package starter.tasks.e2e;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.NameProductsCart;

public class ValidateProductsCart implements Task{

    private String firstProduct;
    private String secondProduct;

    public ValidateProductsCart(String firstProduct, String secondProduct) {
        this.firstProduct = firstProduct;
        this.secondProduct = secondProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ensure.that(NameProductsCart.getFirstNameProducts()).contains(firstProduct),
            Ensure.that(NameProductsCart.getSecondNameProducts()).contains(secondProduct)
        ); 
    }
}
