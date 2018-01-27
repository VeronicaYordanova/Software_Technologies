package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _02_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double sumOfNumbers = firstNumber + secondNumber;

        DecimalFormat df = new DecimalFormat(".##");
        System.out.println(df.format(sumOfNumbers));

    }
}
