package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int len = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1]) {
                len++;

                if(len > bestLen){
                    bestStart = i - 1;
                    bestLen = len;
                }
            }

            else{
                len = 1;
            }

        }
        for (int i = 0; i < bestLen; i++) {
            System.out.print(numbers[bestStart] + " ");

        }
        System.out.println();
    }
}
