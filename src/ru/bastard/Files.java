package ru.bastard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Files {

    public static String directoryCorrector(String directory) {
        String[] arr = directory.split("");
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        for(String s : arr){
            if(s.equals("\\")){
                list.add(s);
                list.add(s);
            }
            else{
                list.add(s);
            }
        }
        for(String s : list){
            str += s;
        }
        return str;
    }
}
