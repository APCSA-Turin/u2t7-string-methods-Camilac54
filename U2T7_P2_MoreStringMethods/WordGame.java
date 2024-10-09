package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;

        System.out.print("Enter first word: ");
        String str1 = scan.nextLine();

        int counter = 0;

        while (score <= 50) {
            System.out.print("Enter next word: ");
            String str2 = scan.nextLine();

            if(str1.compareTo(str2) == 0 ) {
                score -= 10;
                System.out.println("-10 points currnt word is the same; SCORE: " + score);
            } else if (str1.compareTo(str2) < 0) {
                score += 2;
                System.out.println("+2 points; current word alphabetically after; SCORE: " + score);
            } else {
                score -= 5;
                System.out.println("-5 points; current word before alphabetically; SCORE: " + score);
            }

            String str1Len = str1.substring(str1.length() - 2);
            String str2Len = str2.substring(0, 2);

            if (str1Len.equals(str2Len)) {
                score += 5;
                System.out.println("+5 points; last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }

            String letter = str1.substring(0,1);
            int index = str2.indexOf(letter);

            if (index > 0) {
                score += 3;
                System.out.println("+3 points; first letter of previous word foudn in current word; SCORE: " + score);
            }

            int str1FullLen = str1.length();
            int str2FullLen = str2.length();

            if (str1FullLen == str2FullLen) {
                score += 3; 
                System.out.println("+2 points, current word and previous word are the same length; SCORE: " + score);
            }

            str1 = str2;

            counter ++;
        }

        System.out.println("You win! It took you " + counter + " words! Try again fror a lower word count!");

        scan.close();
    }
}