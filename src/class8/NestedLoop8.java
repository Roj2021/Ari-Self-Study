package class8;

public class NestedLoop8 {
    public static void main(String[] args) {

        /*
        3 4 5 6 7 8 9
        4 5 6 7 8 9
        5 6 7 8 9
        6 7  8 9
        7 8 9
         8 9
         9
         */

        for (int i = 3; i < 10; i++) {
            for (int j = i; j <10 ; j++) {
                System.out.print(j+" ");


            }
            System.out.println();
            System.out.println();

        }
    }
}
