package class8;

public class NestedLoops1 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) { //outer Loop

            for (int j = 0; j < 5; j++) { //Inner loop
                if(i==1||j==2){
                    continue;
                }
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}


