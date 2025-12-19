public class Transaction {

    private Account from;
    private Account to;
    private double amount;

    public Transaction(Account from, Account to, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error: Amount must be greater than 0");
        }
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Account getFrom() {
        return from;
    }

    public Account getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{from=" + from.getId() +
                ", to=" + to.getId() +
                ", amount=" + amount + "}";
    }
}
