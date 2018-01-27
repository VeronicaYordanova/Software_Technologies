package com.company;

import java.util.Scanner;

public class _02_Boolean_Variable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        if(input.equalsIgnoreCase("true")){
            System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }




    }
}
