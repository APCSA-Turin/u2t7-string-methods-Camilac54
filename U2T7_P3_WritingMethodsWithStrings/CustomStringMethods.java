package U2T7_P3_WritingMethodsWithStrings;


public class CustomStringMethods {

    /* this class has no instance variables */
  
    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */
    public CustomStringMethods() {}

    public boolean longerThan(String myString, int maxLength) {
        int length = myString.length();

        if (length > maxLength) {
            return true;
        } else {
            return false;
        }
    }
  

    public String funnyString(String str, int idx) {
        String newLetter = str.substring(idx, idx + 1);
        String newString = (newLetter + str + newLetter);
        return newString;
    }
  
    /**Client provides myString and the method returns a String that represents mystring
              with its halves reversed; strings of odd length should have the extra character be a part
              of the second half when initially halved (and appear in the first half in the returned String).
  
              Example:  If myString is computers, this method should return the string uterscomp
              Example:  If myString is "reverse me!", this method should return "e me!revers"; 
    */
    public String halvesReversed(String myString) {
        int length = myString.length();

        int half = length / 2;

        String half1 = myString.substring(0, half);
        String half2 = myString.substring(half);

        return half2 + half1;

    }
  }
  
