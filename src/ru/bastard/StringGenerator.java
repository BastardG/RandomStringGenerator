package ru.bastard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class StringGenerator {

    private static String alphabet = "1234567890!@#$%^:&?%№;?*-_+=qwertyuiopasdfghjklzxcvbnm.,QWERTYUIOPASDFGHJKLZXCVBNM";

    public static String generate(int iterations) {
        String generated_string = "";
        String[] alphabet_array = alphabet.split("");

        for(int i = 0; i < iterations; i++){
            generated_string += alphabet_array[(int)(Math.random() * 82) + 0];
        }

        return generated_string;
    }

    public static void generateFiles(int iterations, int files, String directory) throws IOException {
        int iterator = 0;
        while(iterator < files){
            Path path = Paths.get(directory + "\\" + iterator + ".txt");
            byte[] bs = generate(iterations).getBytes(StandardCharsets.UTF_8);
            Path writtenFilePath = Files.write(path, bs);
            iterator++;
        }
    }

    public static void generateFile(int iterations, int strings, String directory) throws IOException {
        int iterator = 0;
        ArrayList<String> list = new ArrayList<>();
        Path path = Paths.get(directory + "\\rs.txt");
        while(iterator < strings) {
            byte[] bs = generate(iterations).getBytes(StandardCharsets.UTF_8);
            list.add(new String(bs));
            iterator++;
        }
        Files.write(path, list);
    }

}
