package com.company;

import java.util.Scanner;

public class _05_Integer_to_Hex_and_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String hexValue = (Integer.toHexString(input));
        String binaryValue = Integer.toBinaryString(input);
        System.out.println(hexValue.toUpperCase());
        System.out.println(binaryValue);
    }
}
