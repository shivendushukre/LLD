package in.bank.atm.services;

public class CashDispenser {

    private Integer cashAvailable;

    public CashDispenser(Integer cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public synchronized void dispenseCash(Integer amount) {

        if (amount > cashAvailable) {
            throw new IllegalArgumentException("Insufficient cash available in the ATM. Please try to enter a lower amount.");
        }
        cashAvailable -= amount;
        System.out.println("Cash dispensed: " + amount);
    }
}
