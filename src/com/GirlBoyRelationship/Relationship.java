package com.GirlBoyRelationship;
import java.util.Random;

public class Relationship {

    public static String randomRelationship(){
        String names[] = { "Loves", "Hates", "Likes", "is mad with", "is angry with", "sympathizes with" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);

        return names[n];
    }

}