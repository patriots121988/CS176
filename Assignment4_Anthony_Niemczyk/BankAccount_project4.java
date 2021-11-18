public class BankAccount_project4 {
    private String name;
    private int accountNumber;
    double balance;

    public BankAccount_project4(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount_project4() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {

        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount) {

        balance -= amount;
        System.out.println(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "BankAccount{" +
                "name='" + this.name + '\'' +
                ", accountNumber=" + this.accountNumber +
                ", balance=" + this.balance +
                '}';
    }
}
