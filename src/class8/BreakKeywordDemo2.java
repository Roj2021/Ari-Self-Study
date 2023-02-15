package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (temp<=105){

            if(temp<=100){
                System.out.println("I love summer because tempeture is "+temp);
            }else{
                System.out.println("it is very hot "+temp);

            }
            temp+=5;
        }
        System.out.println("**********");

        int num=30;
        while(num<=40){
            if(num<=39){
                System.out.println(" it is winter ");
            }else{
                System.out.println("It is not winter ");
                break;

            }
            num+=5;


        }
    }
}
