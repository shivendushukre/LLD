package in.bank.atm.services;

import in.bank.atm.data.Account;
import in.bank.atm.data.Card;
import in.bank.atm.transaction.DepositTransaction;
import in.bank.atm.transaction.Transaction;
import in.bank.atm.transaction.WithdrawTransaction;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ATMService implements ATM {

    private final Banking bankingService;

    private final CashDispenser cashDispenser;

    private static final AtomicInteger transactionCounter = new AtomicInteger(0);

    public ATMService(Banking bankingService, CashDispenser cashDispenser) {
        this.bankingService = bankingService;
        this.cashDispenser = cashDispenser;
    }

    @Override
    public void authorizeUser(Card card) {
        if (card.getCardNumber().equals("12345") && card.getPin().equals("0000")) {
            System.out.println("User authorized!! Welcome..");
        }
    }

    @Override
    public int checkBalance(String accountNumber) {
        Account account = bankingService.getAccount(accountNumber);
        return account.getBalance();
    }

    @Override
    public void withdrawCash(String accountNumber, Integer amount) {
        Account account = bankingService.getAccount(accountNumber);
        Transaction transaction = new WithdrawTransaction(generateTransactionId(), account, amount);
        bankingService.processTransaction(transaction);
        cashDispenser.dispenseCash(amount);
    }

    @Override
    public void depositCash(String accountNumber, Integer amount) {
        Account account = bankingService.getAccount(accountNumber);
        Transaction transaction = new DepositTransaction(generateTransactionId(), account, amount);
        bankingService.processTransaction(transaction);
    }

    private String generateTransactionId() {
        Integer transactionNumber = ATMService.transactionCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().toString();
        return "TXN" + timestamp + String.format("%d", transactionNumber);
    }
}
