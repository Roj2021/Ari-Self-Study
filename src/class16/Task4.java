package class16;

import class12.Car;
import com.sun.source.tree.CaseTree;

public class Task4 {

    /*
    create a method that will say Hello
    in different language based on the country
    that will be passed when method is executed
    return type => String void
    name => sayHello
    parameter => String countryName
     */

    String sayHello(String countryName){
        switch (countryName){

            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Kurdistan":
                return "Silav";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country is not supported";


        }
    }

    public static void main(String[] args) {

        Task4 task4=new Task4();
        System.out.println(task4.sayHello("Italy"));
        System.out.println(task4.sayHello("Kurdistan"));
        System.out.println(task4.sayHello("Turkey"));

    }
}
