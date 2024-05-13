/*WAP to remove duplicate elements from an array

            Sample input:

                    Array = 1	1	2	3	4	4	7	7
	        Sample Output:

		  	        Array =1	2	3	4	7

            -------md karim-----
*/
package Lab_1;

import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("array element = ");
            int[] arr = find(input);

            int[] anArray = remove(arr);

            System.out.print("Remove duplicate element = ");
            printArray(anArray);
        }
    }

    private static int[] find(Scanner input) {
        String inputElement = input.nextLine();
        String[] element = inputElement.split(" ");
        int[] arr = new int[element.length];
        for (int i = 0; i < element.length; i++) {
            arr[i] = Integer.parseInt(element[i]);
        }
        return arr;
    }

    private static int[] remove(int[] arr) {
        int anIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < anIndex; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[anIndex++] = arr[i];
            }
        }
        int[] anArray = new int[anIndex];
        for (int i = 0; i < anIndex; i++) {
            anArray[i] = arr[i];
        }

        return anArray;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
