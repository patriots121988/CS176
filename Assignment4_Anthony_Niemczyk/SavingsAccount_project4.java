public class SavingsAccount_project4 extends BankAccount_project4 {
    private double intRate;

    public SavingsAccount_project4(String name, int accountNumber, double balance, double intRate) {
        super(name, accountNumber, balance);
        this.intRate = intRate;
    }

    public double getIntRate() {
        System.out.printf("Interest rate: ");
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public static double MonthEnd(double averageDailyBalance){
        double balancePlusInt = 0;
        double intGained = averageDailyBalance * 0.035;
        balancePlusInt = balancePlusInt + intGained;
        System.out.println("$ " + balancePlusInt);
        return balancePlusInt;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + this.intRate;
    }
}
