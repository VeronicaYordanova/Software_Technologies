package com.company;
import java.io.IOException;
import java.util.Scanner;

public class _03_Reverse_Characters {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        StringBuilder builder = new StringBuilder();

        while (!input.isEmpty()){
            builder.append(input);

            input = console.nextLine();
        }
        System.out.println(builder.reverse());
    }
}
