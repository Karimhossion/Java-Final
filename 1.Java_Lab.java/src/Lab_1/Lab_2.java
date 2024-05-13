
/*Problem Statement : Suppose you have an array of numbers .now find out the two elements from the array which sum will be equal to a given number (user input).

Sample input:

                Array  =1	2	5	7
			    Given Number = 9
	Sample Output:
		        The two numbers are : 2, 7


            ------md karim-----
*/
package Lab_1;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Array = ");
            int[] array = find(input);

            System.out.print("Given Number: ");
            int givNumber = input.nextInt();

            int[] result = found(array, givNumber);

            if (result != null) {
                System.out.println("The two elements are = " + result[0] + ", " + result[1]);
            } else {
                System.out.println("Invalid " + givNumber);
            }
        }
    }

    private static int[] find(Scanner input) {
        String inputLine = input.nextLine();
        String[] strin = inputLine.split(" ");
        int[] arr = new int[strin.length];
        int i = 0;
        while (i < strin.length) {
            arr[i] = Integer.parseInt(strin[i]);
            i++;
        }
        return arr;
    }

    private static int[] found(int[] arr, int number) {
        int j = 0;
        while (j < arr.length - 1) {
            int k = j + 1;
            while (k < arr.length) {
                if (arr[j] + arr[k] == number) {
                    return new int[] { arr[j], arr[k] };
                }
                k++;
            }
            j++;
        }
        return null;
    }
}