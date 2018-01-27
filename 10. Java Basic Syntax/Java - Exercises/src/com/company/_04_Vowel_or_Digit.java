package com.company;

import java.io.IOException;
import java.util.Scanner;

public class _04_Vowel_or_Digit {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        char symbol = (char) System.in.read();

        if((symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u')) {
            System.out.println("vowel");

        }else if (Character.isDigit(symbol)){
            System.out.println("digit");
        }
        else{
            System.out.println("other");
        }

    }
}
