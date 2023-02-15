package class12;

public class CarTester {
    public static void main(String[] args) {

        //create the object of the class

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2021;
        bmw.color="Grey";
        bmw.moveForward();

        Car toyota= new Car();
        toyota.make="Toyota";
        toyota.model="Avalon";
        toyota.year=2018;
        toyota.color="Blue";
        toyota.price=30000;

        toyota.moveForward();
        toyota.applyBrakes();


        System.out.println(toyota.make);
        System.out.println(toyota.color);
        System.out.println(toyota.price);


    }


}
