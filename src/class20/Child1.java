package class20;

public class Child1 extends Parent {
    public static void main(String[] args) {

        Child1 child1=new Child1();

        child1.hello();
        child1.bye();
        Parent.bye();// accessing static method in a static way by using class name
        Child1.bye();// accessing static method from parent class using child class name
        // child1.money () ; money() ' has private class in parent class

        child1.name="Roj";
        Child1.lastName="Botani";

    }

}
