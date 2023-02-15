package class7;

public class LoetteryTicket {
    public static void main(String[] args) {

        int [] [] lotteryCard={{20,15,7},
                {8,7 ,19},
                {7, 13, 47} };


        for(int i = 0; i < 4; i++ ){
            for(int j = 0; j < 3; j++){
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}
