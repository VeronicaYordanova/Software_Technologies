package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class _10_Index_of_Letters {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        char[] alphabet = new char[]
                {
                        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
                };

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " -> " + (int)(word.charAt(i) - 97));
        }
    }
}
