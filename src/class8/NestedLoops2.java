package class8;

public class NestedLoops2 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) { //outer Loop

            for (int j = 0; j < 5; j++) { //Inner loop
                if(j==1||j==2){
                    System.out.print(" ");
                }else{
                    System.out.print("*");

                }

            }
            System.out.println();
        }
    }

}


