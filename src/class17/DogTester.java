package class17;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog("Husky","Husky the dog","white",2,25.2);
        Dog bulldog=new Dog("Bulldog","Bulldog the dog","Black",3,27.1);
        Dog labrador=new Dog("Labrador","Labrador the dog","Brown",4,28.0);


        labrador.printInfo();
        bulldog.printInfo();
        husky.printInfo();

    }
}
