package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.AddTransactionModel;
import starter.models.LoginModel;

import java.util.List;

public class GetInfoFromTable {

    public static LoginModel getLogin(DataTable userLogin){

        List<List<String>> rows = userLogin.asLists(String.class);
        String username="";
        String password="";

        for(List<String> columns: rows){
            username=columns.get(0);
            password=columns.get(1);
        }

        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(username);
        loginModel.setPassword(password);

        return loginModel;
    }

    public static AddTransactionModel getAddTransaction(DataTable transaction){

        String date="";
        String amount="";
        List<List<String>> rows = transaction.asLists(String.class);

        for(List<String> columns: rows){
            date=columns.get(0);
            amount=columns.get(1);
        }

        AddTransactionModel addTransactionModel = new AddTransactionModel();
        addTransactionModel.setDataTransaction(date);
        addTransactionModel.setAmountTransaction(amount);

        return addTransactionModel;
    }
}
