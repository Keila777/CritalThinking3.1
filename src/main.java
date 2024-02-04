import java.util.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their weekly income
        System.out.print("Enter your weekly income: ");
        double income = scanner.nextDouble();
        //Calculate the tax rate based on the income bracket
        double taxRate = 0;
        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            if (income >= 2500) {
                taxRate = 0.30;
            }
        }
        // Calculate the tax withheld and weekly average tax witholding
        double taxWitheld = income * taxRate;
        double weeklyAverage = taxWitheld / 52;

        // Output the results to the console
        System.out.println("Weekly income: $" + income);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Tax witheld: $" + taxWitheld);
        System.out.println("Weekly average tax witholding: $" + weeklyAverage);
    }
    }
