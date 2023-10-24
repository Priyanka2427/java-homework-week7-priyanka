package homeworkweek7;
 /*
 * input sales id, seller's name, sales amount, and salary basic and
  then fined this sales Commission
  */

import java.util.Scanner;

public class Programme07_Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sales details
        System.out.println("Enter Sales ID:   ");
        int salesID = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter seller's Name:  ");
        String sellerName = sc.nextLine();

        System.out.println("Enter Sales Amount: ");
        double salesAmount = sc.nextDouble();

        System.out.println("Enter Salary Basic: ");
        double salaryBasic = sc.nextDouble();

        // Calculate sales commission
        double commissionRate = 0.0;

        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double salesCommission = salesAmount * commissionRate;

        // Calculate total earnings
        double totalEarnings = salaryBasic + salesCommission;

        // Display the results
        System.out.println("InSales ID: " + salesID);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: £" + salesAmount);
        System.out.println("Salary Basic: £" + salaryBasic);
        System.out.println("Sales Commission: £" + salesCommission);
        System.out.println("Total Earnings: £" + totalEarnings);
    }
}


