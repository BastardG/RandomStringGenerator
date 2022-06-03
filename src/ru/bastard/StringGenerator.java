package ru.bastard;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public static void generateFile(int iterations, int files, String directory) throws IOException {
        int iterator = 0;
        while(iterator < files){
            Path path = Paths.get(directory + "\\" + iterator + ".txt");
            byte[] bs = generate(iterations).getBytes(StandardCharsets.UTF_8);
            Path writtenFilePath = Files.write(path, bs);
            iterator++;
        }
    }

}
