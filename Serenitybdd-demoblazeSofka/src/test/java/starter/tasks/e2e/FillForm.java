package starter.tasks.e2e;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FillForm implements Task {

    private String name;
    private String country;
    private String city;
    private String card;
    private String month;
    private String year;

    public FillForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(name).into(CartPage.INPUT_NAME),
            Enter.theValue(country).into(CartPage.INPUT_COUNTRY),
            Enter.theValue(city).into(CartPage.INPUT_CITY),
            Enter.theValue(card).into(CartPage.INPUT_CARD),
            Enter.theValue(month).into(CartPage.INPUT_MONTH),
            Enter.theValue(year).into(CartPage.INPUT_YEAR),
            Click.on(CartPage.BUTTON_PURCHASE)
        );
    }
}
