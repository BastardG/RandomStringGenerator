package ru.bastard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string length: ");
        System.out.println(StringGenerator.generate(scanner.nextInt()));
    }

}
