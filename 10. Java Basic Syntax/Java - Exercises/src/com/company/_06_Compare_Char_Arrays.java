package com.company;

import java.util.Scanner;

public class _06_Compare_Char_Arrays {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        char[] firstArray = console.nextLine().replaceAll(" ", "").toCharArray();
        char[] secondArray = console.nextLine().replaceAll(" ", "").toCharArray();

        if(firstArray.length == secondArray.length){
            if(firstArray[0] < secondArray[0]){

                System.out.println(String.valueOf(firstArray));
                System.out.println(String.valueOf(secondArray));

            }
            else{
                System.out.println(String.valueOf(secondArray));
                System.out.println(String.valueOf(firstArray));
            }

        }
        else if(firstArray.length > secondArray.length){
            System.out.println(String.valueOf(secondArray));
            System.out.println(String.valueOf(firstArray));

        }
        else{
            System.out.println(String.valueOf(firstArray));
            System.out.println(String.valueOf(secondArray));
        }

    }
}