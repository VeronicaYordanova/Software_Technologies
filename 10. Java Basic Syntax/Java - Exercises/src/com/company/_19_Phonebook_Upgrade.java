package com.company;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class _19_Phonebook_Upgrade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Map<String, String> phonebook = new TreeMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("A")) {
                String name = tokens[1];
                String phone = tokens[2];
                phonebook.put(name, phone);

            } else if (command.equals("S")) {
                String name = tokens[1];

                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.\n", name);
                }

            } else if (command.equals("ListAll")) {

                for (String key : phonebook.keySet()) {
                    System.out.printf("%s -> %s\n", key, phonebook.get(key));
                }
            }
            input = console.nextLine();
        }
    }
}