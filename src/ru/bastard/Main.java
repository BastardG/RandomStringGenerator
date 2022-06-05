package ru.bastard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int length;
    private static String dir;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?: ");
        System.out.println("1. Just create random string");
        System.out.println("2. Create a files with random string in it");
        System.out.println("3. Create a file with random strings in it");
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Input a length of string: ");
                StringGenerator.generate(scanner.nextInt());
                break;
            case 2:
                System.out.println("Input a length of string: ");
                length = scanner.nextInt();
                System.out.println("Input a numbers of file: ");
                int files = scanner.nextInt();
                System.out.println("Input a full directory: ");
                dir = scanner.next();
                dir = Files.directoryCorrector(dir);
                StringGenerator.generateFiles(length, files, dir);
                break;
            case 3:
                System.out.println("Input a length of strings: ");
                length = scanner.nextInt();
                System.out.println("Input a amount of strings: ");
                int strings = scanner.nextInt();
                System.out.println("Input a directory: ");
                dir = scanner.next();
                dir = Files.directoryCorrector(dir);
                StringGenerator.generateFile(length, strings, dir);
        }
    }

}
