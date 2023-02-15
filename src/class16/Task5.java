package class16;

import class15.Task;

public class Task5 {
    /*
    Write a method to return whether given number is prime or not?
    return type => boolean
    method name=> isPrime
    parameter => int number


     */
    boolean isPrime(int number){

        boolean flag=true;
        if(number>1){
            for (int i = 2; i <number ; i++) {
                if(number%2==0){
                    flag=false;
                    break;
                }

            }
        }else {
            flag=false;
        }
        return flag;


    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println(task5.isPrime(13));
    }

}
