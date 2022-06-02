package ru.bastard;

public class StringGenerator {

    public static String generate(int iterations) {
        String alphabet = "1234567890!@#$%^:&?%№;?*-_+=qwertyuiopasdfghjklzxcvbnm.,QWERTYUIOPASDFGHJKLZXCVBNM";
        String generated_string = "";
        String[] alphabet_array = alphabet.split("");


        for(int i = 0; i < iterations; i++){
            generated_string += alphabet_array[(int)(Math.random() * 82) + 0];
        }

        return generated_string;
    }

}
