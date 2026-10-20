package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

       /* Scanner myscanner = new Scanner(System.in);

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
        float oT = (payRate * hoursWorked) * 1.5;


        System.out.println(userInput + " your gross pay is: "  + grossPay + " this week. ");

        */
        Scanner myScanner = new Scanner(System.in);

        //Get name
        String name = getName(myScanner);
        //Get the hours worked
        double hoursWorked = getHoursWorked(myScanner);
        //Get the payRate
        double payRate = getpayRate(myScanner);
        //Calculate the grossPay
        double grossPay = getgrossPay(hoursWorked, payRate);
        //Calculate OT
        double oThours = hoursWorked - 40;
        double oTpay = getoT(hoursWorked, payRate, oThours);
        //Calculate oTpay
        double totalPay = grossPay + oTpay;


        System.out.println(name + " you made a total pay of $" + totalPay);
    }

    public static String getName(Scanner myScanner) {
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();
        return name;
    }

    public static double getHoursWorked(Scanner mysScanner) {
        System.out.println("How many hours did you work for the week?: ");
        double hoursWorked = mysScanner.nextDouble();
        return hoursWorked;
    }

    public static double getpayRate(Scanner myscanner) {
        System.out.println("Enter your hourly payrate: ");
        double payRate = myscanner.nextDouble();
        return payRate;

    }

    public static double getgrossPay(double hoursWorked, double payRate) {
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }

    public static double getoT(double hoursWorked, double payrate, double oThours) {
        double oTpay = oThours * (payrate * 1.5);

        if (hoursWorked > 40) {
            return oTpay;
        }
        return 0;



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
2. Send your repository URL to your Instructor*/}