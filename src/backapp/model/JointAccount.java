package backapp.model;

/**
 * The {@code JointAccount} class represents a joint bank account with two holders.
 * It contains details such as IBAN, holders, and balance.
 */
public final class JointAccount {

    /**
     * The International Bank Account Number (IBAN) associated with the joint account.
     */
    private final String iban;

    /**
     * The first holder associated with the joint account.
     */
    private final Holder holderOne;

    /**
     * The second holder associated with the joint account.
     */
    private final Holder holderTwo;

    /**
     * The current balance of the joint account.
     */
    private final double balance;

    /**
     * Constructs a new {@code JointAccount} with the specified details.
     *
     * @param iban      The International Bank Account Number (IBAN) associated with the joint account.
     * @param holderOne The first holder associated with the joint account.
     * @param holderTwo The second holder associated with the joint account.
     * @param balance   The current balance of the joint account.
     */
    public JointAccount(String iban, Holder holderOne, Holder holderTwo, double balance) {
        this.iban = iban;
        this.holderOne = holderOne;
        this.holderTwo = holderTwo;
        this.balance = balance;
    }

    /**
     * Retrieves the IBAN associated with the joint account.
     *
     * @return The International Bank Account Number (IBAN).
     */
    public String getIban() {
        return iban;
    }

    /**
     * Retrieves the first holder associated with the joint account.
     *
     * @return The first holder.
     */
    public Holder getHolderOne() {
        return holderOne;
    }

    /**
     * Retrieves the second holder associated with the joint account.
     *
     * @return The second holder.
     */
    public Holder getHolderTwo() {
        return holderTwo;
    }

    /**
     * Retrieves the current balance of the joint account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Converts the joint account object to a string representation.
     *
     * @return A string representation of the joint account, including IBAN, balance, and holder information.
     */
    public String converToString() {
        return "JointAccount iban: "
                + iban
                + ", \n balance: "
                + balance
                + ", \n -- holder one: "
                + holderOne.converToString()
                + ", \n -- holder two: "
                + holderTwo.converToString();
    }
}
