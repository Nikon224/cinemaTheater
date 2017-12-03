package ru.levelup.java;

import java.util.Scanner;

public class ConsoleHelper {

    public void printlnToConsole(String message) {
        System.out.println(message);
    }

    public void printToConsole(String message) {
        System.out.print(message);
    }

    public int getIntValueFromConsole() {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
        int value = -1;
        try (Scanner scanner = new Scanner(System.in)) {
            value = scanner.nextInt();
        }
        return value;
    }

}