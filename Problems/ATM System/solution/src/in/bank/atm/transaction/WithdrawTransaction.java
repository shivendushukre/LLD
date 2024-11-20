package in.bank.atm.transaction;

import in.bank.atm.data.Account;

public class WithdrawTransaction extends Transaction {

    public WithdrawTransaction(String transactionId, Account account, Integer amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
