package starter.tasks.e2e;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import starter.ui.CartPage;
import starter.ui.HomePage;

public class SelectDiffOptions {

    public static Performable selectHome(){
        return Task.where("{0} select home option",
            Click.on(HomePage.OPTION_HOME),
            WaitUntil.the(HomePage.CONTAINER_CATEGORY,isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Performable selectCart(){
        return Task.where("{0} select cart option",
            Click.on(HomePage.OPTION_CART)
        );
    }

    public static Performable selectPlaceOrder(){
        return Task.where("{0} select place order option",
            Click.on(CartPage.BUTTON_PLACE_ORDER)
        );
    }

}
