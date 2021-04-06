package com.GirlBoyRelationship;
import java.util.Random;

public class Boy {

    public static String randomMaleName(){
        Random ran = new Random();

        String names[] = { "Jad", "Arjun", "Oliver", "Wendell", "Efrem", "Ramil" };
        int n = ran.nextInt(6);

        return names[n];

    }

}