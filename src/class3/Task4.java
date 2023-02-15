package class3;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a java program to odd, subtract, multiply and divide 2 decimal value.
        Your program should say  " The input of 2 numbers and
        excepted out :
        The addition of 2 numbers 10.5 and 10.5 is equal to 21.0
        The subtraction of 2 number 10.5 and 10.5 is equal to 0.0
        The multiplication of 2 number 10.5 and 10.5 is equal to 110.25
        The division of 2 number 10.5 and 10.5 is equal to 1.0

         */
        double number1 = 10.5;
        double number2 = 10.5;
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double divison = number1 / number2;


        System.out.println("The Addition of 2 numbers " + number1 + " and " + number2 + " +is equal to " + addition);
        System.out.println("The Subtraction of 2 numbers " + number1 + " and " + number2 + " is equal to " + subtraction);
        System.out.println("The Multiplication of 2 numbers" + number1 + " and " + number2 + " is equal to " + multiplication);
        System.out.println("The Division of 2 numbers" + number1 + " and " + number2 + " is equal to " + divison);

    }
}

