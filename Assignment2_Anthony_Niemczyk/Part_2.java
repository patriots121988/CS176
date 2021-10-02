import java.util.*;

class Part_2 {
        public static void main(String[] args) {
                System.out.println("Enter integers one at a time to populate array, enter 'x' when finished. ");

                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> inputs = new ArrayList<Integer>();
                ArrayList<Integer> reverseArrayList = new ArrayList<Integer>();
                int i = 0;
                int j = 0;

                while (sc.hasNextInt()) {
                        inputs.add(sc.nextInt());
                        }
                if (inputs.equals('x')) {
                        sc.close();
                        System.exit(1);
                }

                System.out.println(inputs);

                //Print elements at even indices
                System.out.print("Elements located at even indices: ");
                for (i = 0; i < inputs.size(); i+=2){
                                System.out.print(inputs.get(i)+" ");
                                }
                System.out.println(" ");
                //Print all even elements with enhanced for loop
                System.out.print("Even element values: ");
                for (int values : inputs) {
                        if (values % 2 == 0) {
                                System.out.print(values+" ");
                                 }
                         }
                System.out.println(" ");
                //Print all odd elements with common loop
                System.out.print("Odd element values: ");
                for (j = 0; j < inputs.size(); j+=2){
                                System.out.print(inputs.get(j)+" ");
                                 }
                System.out.println(" ");
                //Print all elements of the array in reverse order
                System.out.print("Arraylist elements in reverse order: ");
                for (i = inputs.size() -1; i>=0; i--){
                        reverseArrayList.add(inputs.get(i));
                                }
                                System.out.print(reverseArrayList);
                System.out.println(" ");

                //Find first, middle, and last element in array
                System.out.println("First element: "+ inputs.get(0));
                System.out.print("Middle element: ");
                int midElement = inputs.get((inputs.size()/2) + (inputs.size()%2));
                if (inputs.size()%2 == 0){
                        System.out.println(inputs.get(inputs.size()/2)-1);
                }
                else {
                        System.out.println(inputs.get(inputs.size()/2));
                }
                System.out.println("Last element: "+ inputs.get(inputs.size()-1));

                //Print the largest element in the array
                int min = inputs.get(0);
                int max = inputs.get(0);
                int n = inputs.size();

                for (i = 1; i < n; i++){
                        if (inputs.get(i) < min){
                                min = inputs.get(i);
                        }
                }
                for (i = 1; i < n; i++){
                        if (inputs.get(i) > max) {
                                max = inputs.get(i);
                        }
                }
                System.out.println("Max element value in array list: " + max);
                System.out.println("Min element value in array list: " + min);

                //Print alternating sum of arraylist
                int alternatingSum = 0;
                boolean even = true;
                for (int value : inputs){
                        alternatingSum += even ? value : -value;
                        even = !even;
                        }
                System.out.print("Alternating sum of array list values: ");
                System.out.println(alternatingSum);
        }
}

