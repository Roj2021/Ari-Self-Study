package class7;

public class ForLoops4 {
    public static void main(String[] args) {

        // 1 2 4 5 7 8 10 11 12 13 14 16 17 19;

        int i=1;

        for ( i = 0; i <20 ; i++) {
            if(i%3!=0){
                System.out.println(i);
            }

            System.out.println("**************");
            //2 3 4 5 7 8 9
            for (int j = 0; j < 39; j++) {
                if(j%4==0){
                    System.out.println(j);
                }
                System.out.println("*********************");

                for (int k = 0; k < 90; k++) {
                    if(k%50!=0){
                        System.out.println(k);
                    }

                }

            }



        }
    }
}
