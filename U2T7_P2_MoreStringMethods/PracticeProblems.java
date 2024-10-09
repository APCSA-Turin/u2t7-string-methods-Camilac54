package U2T7_P2_MoreStringMethods;
import java.util.Scanner;  

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter string 1: ");
        String str1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scan.nextLine();


        if (str1.equals(str2)) {
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are NOT equal");
        }
        
        if (str1.compareTo(str2) == 0) {
            System.out.println();
        } else if (str1.compareTo(str2) < 0) { 
            System.out.println(str1 + " comes before " + str2 + " alphabetically");
        } else { 
            System.out.println(str2 + " comes before " + str1 + " alphabetically");
        }
        scan.close();
    }
}