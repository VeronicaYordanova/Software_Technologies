package com.company;

import java.util.Scanner;

public class _03_SumOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = scanner.nextInt();

        if (!checkThreeIntegers(firstNumber, secondNumber, sum) &&
                !checkThreeIntegers(sum, firstNumber, secondNumber) &&
                !checkThreeIntegers(secondNumber, sum, firstNumber)) {
            System.out.println("No");
        }

    }

    static boolean checkThreeIntegers(
            int firstNumber, int secondNumber, int sum) {
        if (firstNumber + secondNumber != sum) {
            return false;
        }
        if (firstNumber <= secondNumber) {
            System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, sum);
        } else {
            System.out.printf("%d + %d = %d%n", secondNumber, firstNumber, sum);
        }
        return true;
    }

}
