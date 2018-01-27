package com.company;

import java.util.Scanner;

public class _14_Fit_String_in_20_Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.length() > 20) {
                word = word.substring(0, 20);

            } else if (word.length() < 20) {
                word = String.format("%-20s", word).replace(' ', '*');
            }

        }
        System.out.println(word);
    }


}

