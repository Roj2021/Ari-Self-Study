package class8;

import java.util.Scanner;

public class Repil63 {
    public static void main(String[] args) {
        /*
        int x;
        Write a for loop that will print out a series of numbers starting at 0 and
      ending at the x(value must be taken from a user), exclusive.

*/

        Scanner fetch=new Scanner(System.in);
        System.out.println("Please enter the number");
        int x=fetch.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+" "); //print the numbers on the same line +" " adds space after each number



        }
        System.out.println();


    }
}
