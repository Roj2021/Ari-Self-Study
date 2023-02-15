package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i <20 ; i++) {

            if(i%3==0){
                continue; // skip
            }else {
                System.out.println(i);// this line is skipped when i= 3,6 ,9

            }


        }
    }
}
