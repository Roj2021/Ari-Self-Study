package class7;

public class ForLoops {

    public static void main(String[] args) {

        /*
        prints numbers 0 to 9
         */
        int num = 0; // creating a variable of type int
        while (num < 10) { // checks the condition is true execute the code in the body of while loop
            System.out.println(num);// prints the value of num on the concole
            num++; // it adds one to the number variable
        }
        /*
        (initialize ; condition; incrementORdecrement)
         */

        System.out.println("********************");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // using a for loop print odd numbers from 1 to 20;

        System.out.println("*****************");
        int a = 1;

        for (a = 1; a < 20; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            } else {
                System.out.println("Not odd number");
            }
            //// using a for loop print odd numbers from 1 to 20;

            System.out.println("*****************************________-------");
            int i = 1;


            for (i = 0; i < 20; i = i + 2) {
                System.out.println(i);

            }


        }


    }

}