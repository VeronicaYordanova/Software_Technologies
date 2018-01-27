package com.company;

import java.util.Scanner;

public class _15_Censor_Email_Address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        int index = email.indexOf('@');
        String text = scanner.nextLine();

        String replacement = "";
        for (int i = 0; i < index; i++) {
            replacement+="*";
        }

        text = text.replace(email,replacement+email.substring(index));

        System.out.println(text);
    }
}
