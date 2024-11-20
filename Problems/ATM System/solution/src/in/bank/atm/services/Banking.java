package in.bank.atm.services;

import in.bank.atm.transaction.Transaction;
import in.bank.atm.data.Account;

/**
 * Interface for banking operations, can be extended in future
 */
public interface Banking {
    void createAccount(String accountNumber, Integer balance);

    Account getAccount(String accountNumber);

    void processTransaction(Transaction transaction);
}
