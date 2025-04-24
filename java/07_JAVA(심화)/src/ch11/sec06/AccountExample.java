package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액:"+account.getBalance());

        try{
            account.withdraw(30000);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
