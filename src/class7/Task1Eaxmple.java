package class7;

public class Task1Eaxmple {
    public static void main(String[] args) {

        /*
        Create boolean variable monthWork and assign it true
        create int variable month and assign it
        As long as it is workMonth print "I need a vacation" and increase month
         once monty is 12 " I need to study hard"

         */

        boolean monthWork=true;
        int month=1;
        while(monthWork){
            if(month<12){
                System.out.println("I need a vacation");
            }else {
                System.out.println(" I need to study hard");
                monthWork=false;

            }
            month=month+1;

        }
    }
}
