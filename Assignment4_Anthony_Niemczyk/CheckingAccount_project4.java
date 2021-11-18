public class CheckingAccount_project4 extends BankAccount_project4 {

    public CheckingAccount_project4(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public void MonthEnd(double averageDailyBalance) {
        if (averageDailyBalance < 1500.00) {
                balance -= 20;
                System.out.println("$ "+ balance);
            }
        }
        public String toString() {
            String s = super.toString();
            return s;
        }
    }

