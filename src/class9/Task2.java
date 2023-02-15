package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create a program that will be asking user to apply for a credit card 10 times
        As soon you get a "yes" from a user program should stop asking
         */

        for (int i = 0; i <=10; i++) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Do you want to apply for credit card");
            String userResponse= scanner.next();
            if(userResponse.equalsIgnoreCase("yes")){
                break;



            }

        }
    }
}
