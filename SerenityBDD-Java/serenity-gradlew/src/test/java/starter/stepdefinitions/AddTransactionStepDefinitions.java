package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.models.AddTransactionModel;
import starter.models.LoginModel;
import starter.task.addtransactions.AddTransaction;
import starter.task.addtransactions.CheckNewTransaction;
import starter.task.login.LoginUser;
import starter.task.navigation.NavigateTo;
import starter.util.GetInfoFromTable;

import java.util.List;

public class AddTransactionStepDefinitions {

    String description="Transaction description";

    @Given("{actor} is logged in application")
    public void loggedApplication(Actor actor, DataTable userInfo){

        LoginModel loginModel = GetInfoFromTable.getLogin(userInfo);
        actor.attemptsTo(
                NavigateTo.loginPage(),
                new LoginUser(loginModel.getUsername(),loginModel.getPassword())
        );
    }

    @When("{actor} enter the required information for de new transaction")
    public void enterRequiredInformation(Actor actor, DataTable transaction){

        AddTransactionModel addTransactionModel = GetInfoFromTable.getAddTransaction(transaction);
        actor.attemptsTo(
                new AddTransaction(addTransactionModel.getDataTransaction(),addTransactionModel.getAmountTransaction(),description)
        );
    }

    @Then("{actor} should see a new transaction with correct details in the page")
    public void shouldDetailTransaction(Actor actor){

        actor.attemptsTo(
                CheckNewTransaction.checkInfo(description)
        );
    }


}
