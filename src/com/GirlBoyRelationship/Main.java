package com.GirlBoyRelationship;
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

        Boy nick = new Boy();
        Relationship BoyGirl = new Relationship();
        Girl brit = new Girl();

        System.out.println(Boy.randomMaleName()+ " " + BoyGirl.randomRelationship() + " " + Girl.randomFemaleName());


    }
}