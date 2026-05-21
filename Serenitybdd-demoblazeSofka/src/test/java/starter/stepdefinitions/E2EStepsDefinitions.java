package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.tasks.e2e.AddProducts;
import starter.tasks.e2e.FillForm;
import starter.tasks.e2e.NavigateTo;
import starter.tasks.e2e.SelectDiffOptions;
import starter.tasks.e2e.ValidateProductsCart;
import starter.tasks.e2e.ValidateSuccessPurchase;
import starter.utils.UserData;

public class E2EStepsDefinitions {

    String expectedName = UserData.getName();
    String expectedCountry = UserData.getCountry();
    String expectedCity = UserData.getCity();
    String expectedCardNumber = UserData.getCardNumber();
    String expectedMonth = UserData.getMonth();
    String expectedYear = UserData.getYear();
    String expectedMessage = "Thank you for your purchase!";


    @Given("{actor} navigate to Demoblaze page")
    public void navigateToDemoblaze(Actor actor) {
        actor.attemptsTo(
            NavigateTo.HomePage() 
        );
    }

    @When("{actor} add a product in the category {string} with name {string}")
    public void addProductForName(Actor actor, String category, String productName) {
        actor.remember("firstNameProduct", productName);
        actor.attemptsTo(
            new AddProducts(category, productName)
        );
    }

    @When("{actor} add second product in the category {string} with name {string}")
    public void addSecondProductForName(Actor actor, String category, String productName) {
        actor.remember("secondNameProduct", productName);
        actor.attemptsTo(
            SelectDiffOptions.selectHome(),
            new AddProducts(category, productName) 
        );
    }

    @When("{actor} select cart and click place order")
    public void selectCartAndPlaceOrder(Actor actor) {
        String firstNameProduct = actor.recall("firstNameProduct");
        String secondNameProduct = actor.recall("secondNameProduct");
        actor.attemptsTo(
            SelectDiffOptions.selectCart(),
            new ValidateProductsCart(firstNameProduct, secondNameProduct),
            SelectDiffOptions.selectPlaceOrder()
        );
    }

    @When("{actor} fill all the form and click purchase")
    public void fillFormAndClickPurchase(Actor actor) {
        actor.attemptsTo(
            new FillForm(expectedName, expectedCountry, expectedCity, expectedCardNumber, expectedMonth, expectedYear)
        );
    }

    @Then("{actor} should see the success message")
    public void shouldSeeSuccessMessage(Actor actor) {
        actor.attemptsTo(
            new ValidateSuccessPurchase(expectedMessage, expectedCardNumber, expectedName)
        );
    }
}
