package class14;

public class Task4 {
    public static void main(String[] args) {
        /*
        how would you reverse a String word by word? for example
        input=> this sentence i want to reverse
        output => shiT ecnetnes i tnaw ot esrever
         */

        String str = "This sentence i want to reverse";
        String[] arr = str.split(" ");


       /* for(String word:arr)
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));



            }
        System.out.println(" ");

        */

        for (String word : arr) {
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");

       /* for (String word : arr) {
            System.out.println(new StringBuilder(word).reverse()+" ");

        }*/
        }
    }
}

