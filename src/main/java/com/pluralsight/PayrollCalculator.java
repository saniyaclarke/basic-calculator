package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please, enter Name: ");
        String userInput;
        userInput = myscanner.nextLine();

        System.out.println("Please enter how many hours you have worked this week: ");
        String userInput2 = myscanner.nextLine();
        Float hoursWorked = Float.parseFloat(userInput2);

        System.out.println("Enter your pay rate: ");
        String userInput3 = myscanner.nextLine();
        Float payRate = Float.parseFloat(userInput3);

        float grossPay = payRate * hoursWorked;


        System.out.println(userInput + " your gross pay is: "  + grossPay + " this week. ");



    }
}

/*Step 1
Create a Java application named payroll-calculator that prompts the user to enter:
− their name
− their hours worked (a floating point number)
− their pay rate (a floating point number)
Calculate their gross pay.
Display the employee's name and their gross pay.
Step 2
1. Ensure all your changes are committed and pushed to GitHub
2. Send your repository URL to your Instructor*/