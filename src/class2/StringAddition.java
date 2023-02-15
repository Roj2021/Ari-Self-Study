package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Micheal";

        System.out.println("*****"+firstName+" "+lastName+"*****");

        /*
        java execute code from top to bottom but if we have multiple operations on the same line it
        execute them from left to right
         */

        System.out.println("First name = "+firstName);
        System.out.println("Last name = "+lastName);

        System.out.println("10"+"10");
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);

    }
}
