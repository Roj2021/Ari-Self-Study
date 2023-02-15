package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        
        */

        for (int i = 1; i <=5; i++) {
            System.out.print(i+" ");


        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");

        }

        for (int a = 0; a <=3 ; a++) {
            for (int b = 1; b <=5 ; b++) {
                System.out.print(b+" ");

            }
            System.out.println();

        }



    }
}
