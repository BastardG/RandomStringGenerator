package ru.bastard;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?: ");
        System.out.println("1. Just create random string");
        System.out.println("2. Create a file with random string in it");
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Input a length of string: ");
                StringGenerator.generate(scanner.nextInt());
                break;
            case 2:
                System.out.println("Input a length of string: ");
                int length = scanner.nextInt();
                System.out.println("Input a numbers of file: ");
                int files = scanner.nextInt();
                System.out.println("Input a full directory: ");
                String dir = scanner.next();
                dir = Files.directoryCorrector(dir);
                StringGenerator.generateFile(length, files, dir);
                break;
        }
    }

}
