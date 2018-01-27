package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Most_Frequent_Number {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;
        int number = 0;
        int tempNumber = 0;
        int maxNumber = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            tempNumber = array[i];
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[j] == tempNumber){
                    count++;
                    number = tempNumber;

                }
            }
            if(count > maxCount){
                maxCount = count;
                maxNumber = tempNumber;

            }

        }
        System.out.println(maxNumber);
    }
}
