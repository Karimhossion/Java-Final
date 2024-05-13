/*Problem Statement : 
	Suppose you have two arrays of similar length.
	Now Perform addition the elements of the two arrays position by     position from left to right.
	While performing addition you have to consider the carry and the carry that you get form a addition operator has to be added with the next addition operator.
	You have to create a new array from this operation.
	Now Reverse the two arrays and perform similar operators.
	Check the two output arrays you get from the addition operator, if they are same print "SAME", else print "NOT SAME".


            Array 1         =   4	5	8

            Array 2         =   3	5	5

	        Sum             =   8	1	3

	        Reverse Array 1 =   8	5	4

	        Reverse Array 2 =   5	5	3 

	        Reverse Sum     =	1	2	0	9	
                                
                                NOT SAME

        ------Md Karim------
 */
package Lab_1;

public class Lab_1 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        array1[0] = 4;
        array1[1] = 5;
        array1[2] = 8;

        array2[0] = 3;
        array2[1] = 5;
        array2[2] = 5;

        System.out.print("array 1 : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("array 2 : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int sum1[] = new int[array1.length + 1];
        int sumTemp, carry = 0;
        for (int i = array2.length - 1; i >= 0; i--) {
            sumTemp = array1[i] + array2[i] + carry;
            carry = sumTemp / 10;
            if (sumTemp > 9) {
                sumTemp %= 10;
            }
            sum1[i + 1] = sumTemp;
        }
        sum1[0] = carry;
        carry = 0;

        System.out.print("sum : ");
        for (int i = 1; i < sum1.length; i++) {
            System.out.print(sum1[i] + " ");
        }
        System.out.println();
        // reverse
        int rev = 0;
        for (int i = 0; i < array1.length / 2; i++) {
            rev = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = rev;
        }
        System.out.print("reverse array 1 : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            rev = array2[i];
            array2[i] = array2[array2.length - i - 1];
            array2[array2.length - i - 1] = rev;
        }
        System.out.print("reverse array 2 : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int sum2[] = new int[array2.length + 1];
        for (int i = array2.length - 1; i >= 0; i--) {
            sumTemp = array1[i] + array2[i] + carry;
            carry = sumTemp / 10;
            sumTemp %= 10;
            sum2[i + 1] = sumTemp;
        }
        sum2[0] = carry;
        System.out.print("reverse sum : ");
        for (int i = 0; i < sum2.length; i++) {
            if (i == 0 && sum2[i] == 0) {
                continue;
            }
            System.out.print(sum2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < sum1.length; i++) {
            if (sum1[i] != sum2[i]) {
                System.out.println("NOT SAME");
                break;
            }
        }
        int i;
        for (i = 0; i < sum1.length; i++) {
            if (sum1[i] != sum2[i]) {
                System.out.println("NOT SAME");
                break;
            }
        }
        if (i == sum1.length) {
            System.out.println("SAME");
        }
    }
}

/*
 * @SuppressWarnings("unused")অব্যবহৃত উপাদান সম্পর্কে সতর্কতা উপেক্ষা করতে
 * কম্পাইলারকে বলার জন্য টীকাটি ব্যবহার করা হয় । জাভাতে, যখন আপনি ভেরিয়েবল বা
 * পদ্ধতিগুলি ঘোষণা করেন যা আপনি ব্যবহার করেন না, তখন কম্পাইলার সাধারণত এই
 * সম্ভাব্য সমস্যা সম্পর্কে আপনাকে সতর্ক করার জন্য একটি সতর্কতা তৈরি করে।
 * 
 * উদাহরণস্বরূপ, যদি আপনি একটি ভেরিয়েবল ঘোষণা করেন কিন্তু এটি ব্যবহার না করেন
 * তবে এটি আপনার কোডে একটি ভুল বা অপ্রয়োজনীয় বিশৃঙ্খলা নির্দেশ করতে পারে।
 * যাইহোক, এমন পরিস্থিতি রয়েছে যেখানে আপনি ইচ্ছাকৃতভাবে কিছু তাৎক্ষণিকভাবে
 * ব্যবহার না করে ঘোষণা করতে পারেন, সম্ভবত আপনি এটি পরে ব্যবহার করার পরিকল্পনা
 * করছেন বা এটি একটি ইন্টারফেস চুক্তির অংশ। এই ধরনের ক্ষেত্রে,
 * আপনি @SuppressWarnings("unused")কম্পাইলারকে বলতে ব্যবহার করতে পারেন যে আপনি
 * সতর্কতা সম্পর্কে সচেতন এবং এই নির্দিষ্ট উদাহরণে এটি উপেক্ষা করা যেতে পারে।
 * 
 * আপনার কোড স্নিপেটে, এবং @SuppressWarnings("unused")এর ঘোষণায় প্রয়োগ করা হয়
 * । এটি কম্পাইলারকে এই ভেরিয়েবলগুলির জন্য সতর্কতা তৈরি না করতে বলে, যদিও
 * সেগুলি ঘোষণা করা হয়েছে কিন্তু পদ্ধতিতে ব্যবহার করা হয়নি । এটি অন্যান্য
 * বিকাশকারীদের (এবং নিজের কাছে) সংকেত দেওয়ার একটি উপায় যে এই ভেরিয়েবলগুলি
 * ইচ্ছাকৃতভাবে একটি নির্দিষ্ট কারণে অব্যবহৃত রাখা হয়েছে।array1array2main
 */