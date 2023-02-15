package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp=new MethodPractice();
      boolean isEven=  mp.isEven(15);

        System.out.println(isEven);

        MethodPractice mp1=new MethodPractice();
        boolean isEven1= mp1.isEven2(100);
        System.out.println(isEven1);

        MethodPractice mp2=new MethodPractice();
        boolean isEven2=mp2.isEven2(12);
        System.out.println(isEven2);
        System.out.println(mp.isEven2(20));



    }


}
