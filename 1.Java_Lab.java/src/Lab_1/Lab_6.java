/*
 * Suppose you have an array of strings where the elements of that array are numbers ( ex: “3” , “4” ) . If the length of the string array is n , Then the array should contain numbers from ( 0 to n) . You have to find out the missing element from the array and the time complexity of your solution should be O(n).

            Sample input:      
                            String array = “0”	“1”	“3”
            Sample Output:
		  	                Missing value = 2 
 */

package Lab_1;

import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int size;
            System.out.print("array : ");
            size = input.nextInt();
            int t;
            String[] num = new String[size];
            System.out.print("String array = ");
            for (int i = 0; i < size; i++) {
                t = input.nextInt();
                num[i] = String.valueOf(t);
            }
            int[] numbox = new int[size + 1];
            for (String n : num) {
                numbox[Integer.parseInt(n)] = 1;
            }
            System.out.print("Missing value : ");
            for (int i = 0; i < size + 1; i++) {
                if (numbox[i] == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
