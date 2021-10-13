package BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

            BankAccount harrysChecking = new BankAccount("harrys checking", 12345, 0, false);
            System.out.println(harrysChecking.toString());
            System.out.println();
            BankAccount harrysSavings = new BankAccount("Harry", 86754, 500.00, false);
            System.out.println(harrysSavings.toString());
            System.out.println();
            for( int i =0; i<50; i++) {
                System.out.print("*");
            }
                System.out.println("");
            {
                harrysChecking.deposit(200);
            }
            {
                harrysChecking.withdraw(500);
            }
            {
                harrysChecking.deposit(400);
            }
            {
                harrysChecking.transfer(50, harrysSavings);
            }
            {
                System.out.println("checking account balance: "+harrysChecking.getBalance());
                System.out.println();
                System.out.println("savings account balance: "+harrysSavings.getBalance());
            }
            {
                harrysSavings.addInterest();
                System.out.println(harrysSavings.toString());
            }


        }
    }
