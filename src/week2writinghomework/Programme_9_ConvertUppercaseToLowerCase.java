package week2writinghomework;

import java.util.Scanner;

/**
 * 9.Write a programme to convert the upper case to lower case.
 */
public class Programme_9_ConvertUppercaseToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUppercaseToLowerCase t = new Programme_9_ConvertUppercaseToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //conversion of UpperCase to LowerCase method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is : " + text.toLowerCase());
    }
}
