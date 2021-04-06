package com.GirlBoyRelationship;
import java.util.Random;

public class Girl {

    public static String randomFemaleName(){
        Random ran = new Random();

        String names[] = { "Liam", "Noah", "Oliver", "William", "Elijah", "Benjamin" };
        int n = ran.nextInt(6);

        return names[n];

    }

}