import java.util.Scanner;  

public class U2T7StringMethods {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = scan.nextLine();

    System.out.print("Enter second string: ");
    String str2 = scan.nextLine();

    int len1 = str1.length();
    int len2 = str2.length();

    if (len1 > len2) {
        System.out.println(str1 + " is longer");    
    } else {
        System.out.println(str2 + " is longer");
    }

    if (len1 == len2) {
        System.out.println("Both strings have the same length");
    }

    int str1Half1 = len1 / 2;
    int str2Half2 = len2 / 2;

    System.out.println("First half: " + str1.substring(0, str1Half1));
    System.out.println("Second half: " + str1.substring(str1Half1));
    System.out.println("First half: " + str2.substring(0, str2Half2));
    System.out.println("Second half: " + str2.substring(str2Half2));
    
    int index = str1.indexOf(str2);

    if (index != -1) {
        System.out.println(str2 + " is found in " + str1 + " at index " + index);
    } else {
        System.out.println(str2 + " is NOT found in " + str1);
    }

    scan.close();
    }
}