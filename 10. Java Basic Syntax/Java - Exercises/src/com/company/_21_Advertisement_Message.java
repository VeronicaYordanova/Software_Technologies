package com.company;

import java.util.Random;
import java.util.Scanner;

public class _21_Advertisement_Message {
    public static void main(String[] args) {
        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can't live without this product."
        };

        String[] events = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Scanner console = new Scanner(System.in);

        int count = Integer.parseInt(console.nextLine());
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String randomMessage = randomString(phrases, random) + " "
                    + randomString(events, random) + " "
                    + randomString(author, random) + " "
                    + randomString(cities, random);
            System.out.println(randomMessage);
        }
    }

    private static String randomString(String[] sequence, Random random) {
        int index = random.nextInt(sequence.length);
        return sequence[index];
    }
}
