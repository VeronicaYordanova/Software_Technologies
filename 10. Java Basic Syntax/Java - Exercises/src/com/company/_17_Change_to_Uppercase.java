package com.company;

import java.util.Scanner;

public class _17_Change_to_Uppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        while(input.contains("<upcase>")){
            int indexStart = input.indexOf("<upcase>");
            int indexEnd = input.indexOf("</upcase>") + "</upcase>".length();
            String textToReplace = input.substring(indexStart, indexEnd);
            String textToUpper = textToReplace
                    .substring("<upcase>".length(), textToReplace.length() - "</upcase>".length())
                    .toUpperCase();

            input = input.replace(textToReplace, textToUpper);

        }
        System.out.println(input);
    }
}
