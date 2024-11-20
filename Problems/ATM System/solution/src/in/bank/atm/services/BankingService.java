package in.bank.atm.services;

import in.bank.atm.data.Account;
import in.bank.atm.transaction.Transaction;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService implements Banking {

    private final Map<String, Account> userAccounts = new ConcurrentHashMap<>();

    @Override
    public void createAccount(String accountNumber, Integer balance) {
        userAccounts.put(accountNumber, new Account(accountNumber, balance));
    }

    @Override
    public Account getAccount(String accountNumber) {
        return userAccounts.get(accountNumber);
    }

    @Override
    public void processTransaction(Transaction transaction) {
        transaction.execute();
    }

}
