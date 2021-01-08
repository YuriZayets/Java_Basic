package Classes.Aggregation_and_composition.TaskFour;

public class Account {
    int balance;
    boolean isBlocked;

    public Account(int balance) {
        this(balance, false);
    }

    public Account(int balance, boolean isBlocked) {
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return  "Баланс=" + balance +
                ", isBlocked=" + isBlocked;
    }
}
