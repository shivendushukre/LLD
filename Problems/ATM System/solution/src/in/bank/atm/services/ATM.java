package in.bank.atm.services;

import in.bank.atm.data.Card;

/**
 * Interface for ATM operations, can be extended in future (e.g. PIN generation)
 */
public interface ATM {
    void authorizeUser(Card card);

    int checkBalance(String accountNumber);

    void withdrawCash(String accountNumber, Integer amount);

    void depositCash(String accountNumber, Integer amount);

}
