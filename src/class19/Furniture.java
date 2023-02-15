package class19;

public class Furniture {

    String type;
    double price;
    String color;


    //with help of constructor we can initialize object with spesific value
    Furniture(String type,String color,double price){
        this.type=type;
        this.color=color;
        this.price=price;



    }
  /*  below is a method with name of Furniture. Why - because of return type
  void Furniture(){

    }*/

    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
