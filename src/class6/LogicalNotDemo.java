package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="Pass113";
        if(!password.equals("Pass123")){
            System.out.println("Wrong password");

        }
        boolean isRaining=true;

        if (!isRaining) {

            System.out.println("Lets go to walk");
        }else{
            System.out.println("Let take the umbrella");
        }






    }
}
