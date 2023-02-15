package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More Java";
        String newStr=str.substring(28);
        System.out.println(newStr);

        //We can also specify starting and ending point
        System.out.println(str.substring(0,27));

    }
}
