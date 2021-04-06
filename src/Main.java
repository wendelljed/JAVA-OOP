public class Main {


    public static void main(String[] args){
        Bike jesrayBike = new Bike();
        jesrayBike.name = "Shimano";
        jesrayBike.owner = "Jesray";

        System.out.println(jesrayBike.name);
        System.out.println(jesrayBike.owner);

        jesrayBike.onOffice();

        Bike norimarBike = new Bike();

        System.out.println(norimarBike.name);
        System.out.println(norimarBike.owner);

    }
}