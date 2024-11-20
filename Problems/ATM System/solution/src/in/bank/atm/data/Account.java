package in.bank.atm.data;

/**
 * This class contains the a/c number and balance of the consumer.
 * It provides methods to debit and credit the a/c balance.
 */
public class Account {

    protected String accountNumber;

    protected Integer balance;

    public Account(String accountNumber, Integer balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void debit(Integer userAmount) {
        if (balance < userAmount) {
            throw new IllegalArgumentException("Insufficient balance. Please enter a lower amount to debit.");
        }
        balance -= userAmount;
    }

    public void credit(Integer userAmount) {
        balance += userAmount;
    }
}
