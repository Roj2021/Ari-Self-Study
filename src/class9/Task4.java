package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
       1) Write a program to ask a user to enter item they want to buy and the price of the item.
        Every time user enters money accumulate the price and tell the user how much that they total should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"

         */
        //Break down this problem in to 4 to 5 steps that we can write the code for and can test those independently

        /*
        1)step ask user item price and item name
        2)accumulate the price
        3)tell the user how much that they total should pay
        4)If user give more money program should return a change
        5)Thank you for shopping!
         */

        Scanner scanner=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i <3; i++) {

            System.out.println("Please Enter the item name and its price");
            String itemName= scanner.next();
            double itemPrice= scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);

        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Hey here is your "+change);
        } else if (amountPaid<totalPrice) {
            System.out.println("You can't pay all the items");

        }
        System.out.println("Thank you for shopping!");







    }
}
