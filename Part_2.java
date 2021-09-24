import java.util.Arrays;
import java.util.*;

public class Part_2 {
    public static void main(String[] args) {

        // Initialize an array of doubles taken from user inputs.
        double[] inputs = new double[10];
        int currentSize = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerical values one at a time. Submit value with return key. Enter x when finished.");

        while (sc.hasNextDouble()) {
            if (currentSize >= inputs.length) {
                inputs = Arrays.copyOf(inputs, 2 * inputs.length);
            }
            {
                inputs[currentSize] = sc.nextDouble();
                currentSize++;
            }
        }
            {
               if (sc.equals("x"));
                System.out.print(Arrays.toString(inputs));
            }

            System.out.println('\n');

                // Print all even elements in array
                for (int i = 0; i < inputs.length; i++) {
                    if (inputs[i] % 2 == 0) {
                        System.out.println("even element values in array = " + (inputs[i]));
                    }
                }

            System.out.println('\n');

        // Print all even elements of the array with an enhanced for loop
                for (double element : inputs) {
                    if (element % 2 != 0) {
                        System.out.println("even index element value = " + (inputs));
                    }
                }

            System.out.println('\n');

        // Print all odd index elemets of the array with common loop
                    for (int i = 0; i < inputs.length; i++) {
                        if (inputs[i]%2!=0){
                            System.out.println("odd index element value = " + (inputs[i]));
                        }
                    }

            System.out.println('\n');

                    // Print all elements of array in reverse order
            System.out.println("Array values displayed in reverse order: ");
            for (int i = inputs.length - 1; i >= 0; i--) {
                for (double s : Arrays.asList(inputs[i])) {
                    System.out.print(s + "|");
                }
            }

            System.out.println('\n');
            //Print the first, fifth and last element
            System.out.println("First element value: " + inputs[0]);
            System.out.println("Fifth element value: " + inputs[4]);
            System.out.println("Last element value: " + inputs[currentSize - 1]);

            System.out.println('\n');
            //Print the smallest and largest elements in the array
            double largestValue = inputs[0];
            for (int i = 1; i < inputs.length; i++) {
                if (inputs[i] > largestValue)
                    largestValue = inputs[i];
            }
            System.out.println("Largest value in array: " + largestValue);

            double smallestValue = inputs[0];
            for (int i = 0; i < inputs.length; i++) {
                if (inputs[i] < smallestValue)
                    smallestValue = inputs[i];
            }
            System.out.println("Smallest value in array: " + smallestValue);

            //Print alternating sum value of array elements
        double sum = 0;
        boolean even = true;
        for(int i = 0; i <inputs.length; i++){
            sum += even ? inputs[i] : -inputs[i];
            even = !even;
        }
        {
            return sum;
        }

    }
}