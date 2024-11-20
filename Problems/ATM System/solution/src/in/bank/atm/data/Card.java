package in.bank.atm.data;

/**
 * This class defines the card number and pin of the account holder.
 */
public class Card {

    protected String cardNumber;

    protected String pin;

    public Card(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

}
