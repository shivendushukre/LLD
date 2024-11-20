package in.bank.atm;

import in.bank.atm.data.Card;
import in.bank.atm.services.ATMService;
import in.bank.atm.services.Banking;
import in.bank.atm.services.BankingService;
import in.bank.atm.services.CashDispenser;

/**
 * Main class which acts as an ATM
 */
public class ATMDemo {
    public static void main(String[] args) {
        Banking bankingService = new BankingService();

        CashDispenser cashDispenser = new CashDispenser(100000);

        ATMService atm = new ATMService(bankingService, cashDispenser);

        System.out.println("Welcome to ABC Bank!!");
        // create accounts
        bankingService.createAccount("12345", 1000);
        bankingService.createAccount("53543", 500);

        // enter the card
        Card card = new Card("12345", "0000");

        // authorized user and card
        atm.authorizeUser(card);

        // enter the amount
        // balance check
        int balance = atm.checkBalance("12345");
        System.out.println("Account balance: " + balance);

        // enter pin
        // cash dispense
        atm.withdrawCash("12345", 200);
        atm.depositCash("12345", 500);

        balance = atm.checkBalance("12345");
        System.out.println("Updated account balance: " + balance);

        System.out.println("Thank you, have a nice day!!");
    }
}