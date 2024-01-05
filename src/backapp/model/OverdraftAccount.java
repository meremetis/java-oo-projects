package backapp.model;

/**
 * The {@code OverdraftAccount} class represents a bank account with overdraft capability,
 * allowing the balance to go below zero. It contains details such as IBAN, holder, and balance.
 */
public final class OverdraftAccount {

    /**
     * The International Bank Account Number (IBAN) associated with the overdraft account.
     */
    private final String iban;

    /**
     * The holder associated with the overdraft account.
     */
    private final Holder holder;

    /**
     * The current balance of the overdraft account.
     */
    private double balance;

    /**
     * Constructs a new {@code OverdraftAccount} with the specified details.
     *
     * @param iban    The International Bank Account Number (IBAN) associated with the overdraft account.
     * @param holder  The holder associated with the overdraft account.
     * @param balance The current balance of the overdraft account.
     */
    public OverdraftAccount(String iban, Holder holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    /**
     * Retrieves the IBAN associated with the overdraft account.
     *
     * @return The International Bank Account Number (IBAN).
     */
    public String getIban() {
        return iban;
    }

    /**
     * Retrieves the holder associated with the overdraft account.
     *
     * @return The holder.
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * Retrieves the current balance of the overdraft account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the overdraft account to the specified value.
     *
     * @param balance The new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Converts the overdraft account object to a string representation.
     *
     * @return A string representation of the overdraft account, including IBAN, balance, and holder information.
     */
    public String converToString() {
        return "OverdraftAccount iban: " + iban + ", balance: " + balance + ",  " + holder.converToString();
    }

    /**
     * Withdraws the specified amount from the overdraft account, given a valid social security number (SSN).
     *
     * @param amount The amount to withdraw.
     * @param ssn    The social security number for verification.
     * @throws Exception If the amount is zero or negative, or if the provided SSN is incorrect.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Cannot request 0 or negative amount to withdraw");
            }

            if (!isSsnValid(ssn)) {
                throw new Exception("Incorrect SSN");
            }

            balance -= amount;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Checks if the provided social security number (SSN) matches the holder's SSN.
     *
     * @param ssn The social security number for comparison.
     * @return {@code true} if the SSNs match, {@code false} otherwise.
     */
    private boolean isSsnValid(String ssn) {
        return this.holder.getSsn().equals(ssn);
    }
}
