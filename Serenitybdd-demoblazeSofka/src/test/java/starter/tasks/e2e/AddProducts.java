package starter.tasks.e2e;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import starter.ui.HomePage;
import starter.ui.ProductPage;

public class AddProducts implements Task {

    private String category;
    private String productName;

    public AddProducts(String category, String productName) {
        this.category = category;
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HomePage.OPTION_CATEGORY.of(category)),
            Click.on(HomePage.OPTION_PRODUCT.of(productName)),
            Click.on(ProductPage.BUTTON_ADD_TO_CART),
            Switch.toAlert().andAccept()
        );
    }
}
