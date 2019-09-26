import java.util.Scanner;

public class IntersetRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = input.nextDouble();
        System.out.print("Enter number of month: ");
        int month = input.nextInt();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interestRate / 100) / 12 * month;
        }
        System.out.println(total_interest);


    }
}
