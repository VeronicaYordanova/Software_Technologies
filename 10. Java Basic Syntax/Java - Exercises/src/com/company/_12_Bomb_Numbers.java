package com.company;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class _12_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int [] removedNumbers = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        int bombNumber = removedNumbers[0];
        int countOfRemovedNumbers = removedNumbers[1];


        ArrayList<Integer> remainingNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            remainingNumbers.add(array[i]);
        }

        while (remainingNumbers.indexOf(bombNumber) != -1) {
            int bombIndex = remainingNumbers.indexOf(bombNumber);
            int bombRangeStart = Math.max(0, bombIndex - countOfRemovedNumbers);
            int bombRangeEnd = Math.min(bombIndex + countOfRemovedNumbers, remainingNumbers.size() - 1);

            for (int j = bombRangeStart; j <= bombRangeEnd; j++){
                remainingNumbers.remove(bombRangeStart);
            }
        }
        Long sum = 0L;

        for (int number: remainingNumbers){
            sum += number;
        }
        System.out.println(sum);

    }
}

