package homeworkweek7;

import java.util.Scanner;

// find out total, percentage and result And print Mark Sheet in following format
public class Programme03_MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student information
        System.out.println("Enter student Name:   ");
        String name = sc.nextLine();

        System.out.println("Enter Roll No:  ");
        int rollNo = sc.nextInt();

        //Input marks for Math,Science , and English
        System.out.println("Enter Math marks (0-100):  ");
        int mathMarks = sc.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = sc.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.print("Enter English marks (0-100): ");
        int englishMarks = sc.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;
        // Determine the result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "D"; // If percentage is less than 35
        }

        // Print the mark sheet
        System.out.println("_______________________________");
        System.out.println("|                           |");
        System.out.println("|       Mark Sheet          |");
        System.out.println("|____________________________|");
        System.out.println("| Name : " + name + " |");
        System.out.println("| Roll No: " + rollNo + "     |");
        System.out.println("|____________________________|");
        System.out.println("| Subjects : Marks          |");
        System.out.println("|____________________________|");
        System.out.println("| Math : " + mathMarks + "        |");
        System.out.println("| Science : " + scienceMarks + "    |");
        System.out.println("| English : " + englishMarks + "    |");
        System.out.println("|____________________________|");
        System.out.println("| Total : " + totalMarks + "      |");
        System.out.println("|____________________________|");
        System.out.println("| Percentage : " + percentage + " |");
        System.out.println("| Result : " + result + "      |");
        System.out.println("| Grade : " + grade + "       |");
        System.out.println("|____________________________|");

        sc.close();
    }
}