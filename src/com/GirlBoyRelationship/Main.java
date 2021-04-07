package com.GirlBoyRelationship;
import java.util.Random;

/*public class Main {

   public static void main(String[] args){
        Bike jesrayBike = new Bike();
        jesrayBike.name = "Shimano";
        jesrayBike.owner = "Jesray";

        System.out.println(jesrayBike.name);
        System.out.println(jesrayBike.owner);

        Bike.onOffice();

        Bike norimarBike = new Bike();
        norimarBike.name = "Litespeed";
        norimarBike.owner = "Norimar";

        System.out.println(norimarBike.name);
        System.out.println(norimarBike.owner);
        Bike.ofTrail();
*/



public class Main {

   public static void main(String[] args) {
        /*
        Boy nick = new Boy();

        Relationship BoyGirl = new Relationship();
        Girl brit = new Girl();
         */
        //System.out.println(Boy.randomMaleName()+ " " + Relationship.randomRelationship() + " " + Girl.randomFemaleName());

       Random r = new Random();
       Relationship myrelation = new Relationship();
       Boy myBoy = new Boy();
       Girl myGirl = new Girl();

       String[] bNames = { "Jad", "Arjun", "Oliver", "Wendell", "Efrem" };
       String[] relationship = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};
       String[] gNames = { "Mila", "Eva", "Andrea", "Rosary", "Jessica", "June" };

       myBoy.setbNames(bNames);
       myGirl.setgNames(gNames);
       myrelation.setRel(relationship);


       System.out.println(myBoy.getbNames()[r.nextInt(5)]+" "+myrelation.getRel()[r.nextInt(5)]+" "+myGirl.getgNames()[r.nextInt(5)]);

    }
}

