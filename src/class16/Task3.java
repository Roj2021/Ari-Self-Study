package class16;

public class Task3 {
    /*
    Create a method taht will print whether given String is palindrome or not
    return type => void
    method name => isPalindrome
    parameters => String inputStr
    {
    }
    example dad= dad true
    abc => cba false

     */

    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str + " Not is  palindrome");
        }
    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
      // String result= task3.isPalindrome("Kaya"); can;t assignt void methods to variables
       // System.out.println(task3.isPalindrome("Kaya")); can't use void methods in Println
        task3.isPalindrome("Kaya ");
    }
    }




