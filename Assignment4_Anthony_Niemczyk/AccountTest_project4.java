public class AccountTest_project4 {

    public static void main(String []args){
        BankAccount_project4 b1 = new CheckingAccount_project4("Nina Masters", 00001, 1000);
        System.out.println(b1);
        System.out.println();
        CheckingAccount_project4 c1 = new CheckingAccount_project4("John Smith", 00002, 500);
        System.out.println(c1);
        System.out.println();
        SavingsAccount_project4 s1 = new SavingsAccount_project4("Amy Smith", 0003, 15000, 0.035);
        System.out.println(s1);
        System.out.println();
        System.out.printf("Checking account deposit Sept 16. New balance: ");c1.deposit(10000);
        System.out.println();
        System.out.printf("Savings account withdrawal Sept 21. New balance: ");s1.withdraw(5000);
        System.out.println();
        System.out.printf("Checking account average daily balance fee $20. New balance: ");c1.MonthEnd(350);
        System.out.println();
        System.out.printf("Savings account interest accumulated: ");s1.MonthEnd(350);

    }
}
