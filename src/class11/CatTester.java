package class11;

public class CatTester {
    public static void main(String[] args) {
        //creating an object from the Cat class
        Cat cat1=new Cat();
        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;
        cat1.eat();
        System.out.println(cat1.color);
        System.out.println(cat1.name);
        System.out.println(cat1.age);

        Cat cat2=new Cat();
        cat2.name="loki";
        cat2.breed="Domestic";
        cat2.color="White";
        cat2.age=4;

        cat2.speak();
        cat2.eat();
        System.out.println(cat2.age);
        System.out.println(cat2.color);



    }
}
