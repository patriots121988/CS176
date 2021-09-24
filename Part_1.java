import java.util.Arrays;
import java.util.*;

public class Part_1{
    public static void main(String[] args){
        //Declare an array of 10 integers
        int[] first_array = new int[10];

        //Place the number 17 as the initial element in the array
        first_array[0] = 17;
        System.out.println(first_array);
        //Place the number 29 as the last element in the array
        first_array[9] = 29;
        System.out.println(first_array);
        // Set all values between first and last element to -1
        Arrays.fill(first_array, 1, 9, -1);
        {
            System.out.println(Arrays.toString(first_array));
        }
        //Add 1 to each element of the array
        int[] array_plus1= new int[first_array.length];
        int[] array = new int[first_array.length];
        for (int i = 0; i < first_array.length; i++){
            array[i] = first_array[i]+1;
        }
        System.out.println(Arrays.toString(array));

        // Print all elements of the array on a new line
        for (int element : array)
            System.out.println(element);
        System.out.println("\n");

    }
}
