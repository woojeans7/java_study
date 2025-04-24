package ch11.sec06;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) throws InsufficientException {
        if (balance < amount) {
            throw new InsufficientException("잔고 부족: "+(amount - balance)+"모자람");
        }
        balance -= amount;
    }
}
