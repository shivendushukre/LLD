package in.bank.atm.transaction;

import in.bank.atm.data.Account;

public class DepositTransaction extends Transaction {

    public DepositTransaction(String transactionId, Account account, Integer amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.credit(amount);
    }
}
