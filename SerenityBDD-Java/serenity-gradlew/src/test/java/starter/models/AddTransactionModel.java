package starter.models;

public class AddTransactionModel {

    public String getDataTransaction() {
        return dataTransaction;
    }

    public void setDataTransaction(String dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public String getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(String amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    String dataTransaction;
    String amountTransaction;
}
