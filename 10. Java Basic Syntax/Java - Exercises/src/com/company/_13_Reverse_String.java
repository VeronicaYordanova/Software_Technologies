package com.company;

import java.util.Scanner;

public class _13_Reverse_String {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);

    }
}
