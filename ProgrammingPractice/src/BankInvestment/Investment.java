package BankInvestment;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {

      //  Scanner sc = new Scanner(System.in);
                // Fixed parameters
                double initialAmount = 5000 ;
                double monthlyContribution = 1000;
                double annualInterestRate = 12;
                int investmentPeriodYears = 5;

                // Calculate the number of months for investment
                int investmentPeriodMonths = investmentPeriodYears * 12;

                double totalAmount = initialAmount;
                double monthlyInterestRate = annualInterestRate / 12 / 100 ;

                // Print headers
                System.out.println("Month\tBalance (₹)");

                // Calculate and print the balance for each month
                for (int month = 1; month <= investmentPeriodMonths; month++) {
                    totalAmount = (totalAmount  + monthlyContribution)*( 1 + monthlyInterestRate);
                    System.out.println(month + "\t" + String.format("%.2f", totalAmount));

                }
            }
        }
