package class16;

public class Person {
    private double bankBalance=125000;
    String Address="Street 123";//default access level is applied
    public String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("pass123");

    }
    void printSSN(){
        System.out.println("12345670");
    }
    public void printTikTocAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printSSN();
        person.printPhonePassword();
        person.printTikTocAccount();




    }

}
