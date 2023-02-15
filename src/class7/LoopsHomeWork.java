package class7;

public class LoopsHomeWork {
    public static void main(String[] args) {

        // Print numbers from 1 to 100 in line with space

        for (int i = 1; i < 100; i++) {
            if(i<100){
                System.out.print(" "+i);
            }


        }
        //print numbers from 100 to 1
        System.out.println("*************");

        for (int j =100; j >1 ; j--) {
            if(j<100){
                System.out.println(j);
            }


        }
        System.out.println("************");
        // print even number from 20 to 1 (2 ways)

        int a=20;
        while (a<20);
            System.out.println(a%2==0);
            a-=0;

        {

        }
        for (int b = 20; b < 1; b--) {
           if(b%2==0){
               System.out.println(b);

           }

        }
        //print odd numbers between 20 and 50 (2 ways)
        System.out.println("*********");

        int num=20;
        while (num<=50){
            System.out.println(num%2!=2);
            num=num+1;
        }
        System.out.println("********");
        for (int number = 20; number < 50; number++) {
           if(number%2!=0){
               System.out.println(number);
           }

        }

    }
}
