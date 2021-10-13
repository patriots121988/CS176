package BankAccount;

public class BankAccount {
    private int accountNum;
    private String name;
    private boolean overdrawn;
    private double balance;
    private final double INTEREST = 0.035;

    public BankAccount() {
        balance = 0;
    }

    // constructor with four params
    public BankAccount(String acctname, int acctNum, double initialBalance, boolean status) {
        name = acctname;
        accountNum = acctNum;
        balance = initialBalance;
        overdrawn = status;
    }
    public long getAccountNum () {
            return accountNum;
        }

        public void setAccountNum(int acctNum){
            accountNum = acctNum;
        }

        public String getAccountName () {
            return name;
        }

        public void setAccountName (String acctname){
            name = acctname;
        }

        public boolean isOverdrawn () {
            return overdrawn;
        }

        public void setOverdrawn ( boolean status){ overdrawn = status; }

        public void deposit ( double amount){
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Available balance: "+balance);
            }
            if (balance > 1){
                System.out.println("Account is not currently overdrawn.");
                System.out.println();
            }
        }

        public void withdraw (double amount){
            if (amount <= balance) {
                overdrawn = false;
                balance = balance - amount;
                System.out.println(getBalance());
                System.out.println("Account not currently overdrawn. ");
                System.out.println();

            }
                else {
                    overdrawn = true;
                    balance = balance - amount;
                    System.out.println("Transaction amount will overdraw account. ");
                    System.out.println(getBalance());
                    System.out.println();
                }
            }

        public void transfer ( double amount, BankAccount otherAccount) {
            //Transfer amount from account to otherAccount
            if (amount < balance) {
                withdraw(amount);
                otherAccount.deposit(amount);
                System.out.println();
            } else if
                (amount > balance){
                System.out.println();
                System.out.println("Insufficient funds");
            }
        }

        public double addInterest () {
        balance += (balance * INTEREST);
        return balance;
        }

        public String toString () {
            if (overdrawn) {
                return ("Account is currently overdrawn");
            } else {
                return ("The Account Number " + accountNum + " is owned by " + name + " with a balance of $" + balance);
            }
        }

        public double getBalance () {
        System.out.print("Current funds available: ");
            return balance;
        }
    }




