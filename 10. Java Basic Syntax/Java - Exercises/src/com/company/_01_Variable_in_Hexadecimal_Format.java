package com.company;

import java.util.Scanner;

public class _01_Variable_in_Hexadecimal_Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = Integer.parseInt(input, 16);
        System.out.println(result);
    }
}