package in.bank.atm.transaction;

import in.bank.atm.data.Account;

public abstract class Transaction {

    protected String transactionId;

    protected Account account;

    protected Integer amount;

    public Transaction(String transactionId, Account account, Integer amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();
}
