package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _18_Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        HashMap<String, String> phonebook = new HashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("A")) {
                String name = tokens[1];
                String phone = tokens[2];


                if (!phonebook.containsKey(name)) {
                    phonebook.put(name, "");
                }
                phonebook.put(name, phone);
            }

            else {
                String name = tokens[1];

                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.\n", name);
                }

            }
            input = console.nextLine();
        }
    }
}
