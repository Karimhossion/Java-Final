/*Problem Statement : Write a java program to find out the frequency of a substring in a string . Where you have to 
	---- create a different class to perform the given operation.
	---- use the constructor of that class to take user inputs (both the string and the substring).
	---- create a method in that class which returns the frequency.
	---- call the from main class and display result.

        Sample input:
                            String : javalab javalab
			                Substring : lab 
	    Sample Output:
		  	                Frequency of substring : 2
 */
package Lab_1;

import java.util.Scanner;

class Main {
    Scanner input = new Scanner(System.in);
    String str=" ";
    String substr=" ";

    Main(){
        System.out.print("String : ");
        str=input.nextLine();
        System.out.print("Sub String : ");
        substr=input.nextLine();
    }
    public int frequency(){
        int frequency=0, index=0;
        while (index<str.length()) {
            index=str.indexOf(substr, index);
            if (index!=1) {
                frequency++;
                index+=substr.length();
            }
            else{
                break;
            }
        }
        return frequency;
    }
}
public class Lab_4 {
    public static void main(String[] args) {
        Main obj =new Main();
        int frequency = obj.frequency();
        System.out.println("Frequency of substring : "+frequency);
    }
}