package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in the computer memory.
        we are calling box1 if we need the information that we rae starting inside this box
        we can simply say to the computer give us the contents of box1.
       int => is the name if the box
       = sign will take whatever we write after it and will tore it inside the box1
       10=> is what we are storing inside the box

         */
        int box1=10;
        /*
         if we are printing something from a box we don't need ""

        System.out.println(box1);// bring the content of the box1 and print them on the console
        To store whole numbers(numbers without decimals points) we have 4 different types of boxes.
        for example numbers like 10 20 3000 100000 30000000
        1) byte 2) short 3) int 4) long


         */
        byte box2=127; // range for byte -128 to 127 if we need store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=12839993; // most common type of box
        long maxBox=1527682999920l;

        /*
        Reserve a box which can hold the number 10000 call nit myBox and print its value on the console
         */

        short myBox=1000;
        System.out.println(myBox);



    }
}
