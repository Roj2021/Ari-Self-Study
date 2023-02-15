package class8;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class LoopWithString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your name");
        while (scanner.next().equalsIgnoreCase("Sha")){

            System.out.println("Great student who always wanted an example with String in Loop");
        }
        System.out.println("****************");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a name");
        while(input.next().equalsIgnoreCase("ali")){
            System.out.println("Person who works hard");

        }

    }
}
