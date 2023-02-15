package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str=" kJGFUHFJHJGZZZKKQQkjjkghcjjhj23346^66*&^%$#@()()";
        //replaces all the Upper case letters from A-Z
        System.out.println(str.replaceAll("[A-K]","#"));
        //replace all the lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

    }
}
