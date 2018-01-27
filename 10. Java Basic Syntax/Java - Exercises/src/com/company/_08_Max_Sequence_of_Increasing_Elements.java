package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Max_Sequence_of_Increasing_Elements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int len = 1;
        int bestStart = 0;
        int bestLen = 0;


        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[i - 1])
            {
                len++;
            }
            else
            {
                start = i;
                len = 1;
            }

            if (len > bestLen)
            {
                bestStart = start;
                bestLen = len;
            }
        }

        for (int i = bestStart; i < bestStart + bestLen; i++)
        {

            System.out.print(array[i] + " ");

        }

        System.out.println();
    }
}

