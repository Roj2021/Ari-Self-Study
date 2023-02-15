package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int[] array1 = {10, 10, 10, 20, 30};

        addArrayElementsMachine(array1);
        int [] array2={20,20,40,40};
        addArrayElementsMachine(array2);

    }
        static void addArrayElementsMachine(int [] arr){
            int sum=0;
            for (int number:arr){
                sum+=number;
            }
            System.out.println(sum);

        }

    }

