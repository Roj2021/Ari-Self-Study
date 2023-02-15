package class8;

public class NestedLoops3 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) { //outer Loop

          if(i==1){
              System.out.println();
              continue;
          }

            for (int j = 0; j < 5; j++) { //Inner loop

                System.out.print("*");

            }
            System.out.println();
        }

    }
}



