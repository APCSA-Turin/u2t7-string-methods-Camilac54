package U2T7_P3_WritingMethodsWithStrings;


public class CustomStringMethods {

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
  
    public String halvesReversed(String myString) {
        int length = myString.length();

        int half = length / 2;

        String half1 = myString.substring(0, half);
        String half2 = myString.substring(half);

        return half2 + half1;

    }

    public String pigLatin (String orig) {
        String firstLetter = orig.substring (0,1);
        String pigLatin = "ay";

        return (orig.substring(1) + firstLetter + pigLatin);
    }

    public String removeCharacter (String myString, int removeIdx) {
        int length = myString.length();
        String newString = myString;

        if (length >= removeIdx && removeIdx < length) { 
            String half1 = myString.substring(0, removeIdx);
            String half2 = myString.substring(removeIdx + 1);

            newString = half1 + half2;
        } 

        return newString;
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        int insertIdx = orig.indexOf(searchStr);
        String string = " ";

        if (insertIdx != -1) {
            string = orig.substring(0, insertIdx) + insertText + orig.substring(insertIdx);
        } else {
            string = orig + insertText;
        }
        return string;
    }

    public String endUp(String myString, int numToCap){
        int length = myString.length();

        if(numToCap >= length) {
            return myString.toUpperCase();
        }

        String half1 = myString.substring(0, length - numToCap);
        String half2 = myString.substring(length - numToCap);

        return half1 + half2.toUpperCase();
    }
  
    
    public String yellOrWhisper(String myString) {
        String firstLetter = myString.substring(0, 1);

        if (firstLetter == firstLetter.toUpperCase()){
            return myString.toUpperCase();
        } else {
            return myString.toLowerCase();
        }
    }
  }