package class8;

public class NestedLoops {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) { //outer Loop

            for (int j = 0; j < 5; j++) { //Inner loop
                System.out.println("i = "+i+" j = "+j);
                }
            System.out.println("***********");

            }
        System.out.println("New Line");

        for (int a = 0; a <6; a++) {
            for (int b = 0; b < 7; b++) {
                System.out.println(b);

            }
            System.out.println("*******");
        }

        }
    }

