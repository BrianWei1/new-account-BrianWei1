import java.util.Scanner;

/**
 * NewAccount inputs the initial balance and the annual interest rate and shows the amount after the first three months
 */
public class NewAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double balance = getBalance(in);
        double rate = getInterestRate(in);

        double firstmonth = balance * (1+rate/1200);
        double secondmonth = firstmonth * (1+rate/1200);
        double thirdmonth = secondmonth * (1+rate/1200);
        System.out.printf("Initial Balance: $%.2f\n", balance);
        System.out.println("Annual interest rate in percent: " + rate + "\n");
        System.out.printf("After first month:                 $%.2f\n", firstmonth);
        System.out.printf("After second month:                $%.2f\n", secondmonth);
        System.out.printf("After third month:                 $%.2f\n", thirdmonth);
    }

    /**
     * inputs the balance and returns it
     * @param in
     * @return
     */
    private static double getBalance(Scanner in) {
        System.out.print("Initial Balance: ");
        double amount = in.nextDouble();
        return amount;
    }

    /**
     * inputs the rate and returns it
     * @param in
     * @return
     */
    private static double getInterestRate(Scanner in) {
        System.out.print("Annual interest rate in percent: ");
        double interest = in.nextDouble();
        return interest;
    }
}

