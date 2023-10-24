package homeworkweek7;

import java.util.Scanner;

/**
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 */
public class Programme05_SalarySlip {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter Employee Id:  ");
        int employeeId = sc.nextInt();
        sc.nextLine();  //Consume the new line character

        System.out.println("Enter Employee Name:   ");
        String employeeName = sc.nextLine();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate allowances and deductions
        double HRA = basicSalary * 0.10;
        double TA = basicSalary * 0.08;
        double DA = basicSalary * 0.09;
        double PF = basicSalary * 0.20;

        // Calculate Gross Salary
        double grossSalary = basicSalary + HRA + TA + DA - PF;

        // Print the salary slip
        System.out.println("_______________________________");
        System.out.println("| Salary Slip |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : " + employeeId + " |");
        System.out.println("| Employee Name : " + employeeName + " |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : " + basicSalary + " |");
        System.out.println("| HRA 10% : " + HRA + " |");
        System.out.println("| TA 8% : " + TA + " |");
        System.out.println("| DA 9% : " + DA + " |");
        System.out.println("| PF - 20% : " + PF + " |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : " + grossSalary + " |");
        System.out.println("|===========================|");

        // Close the scanner
        sc.close();
    }
}
