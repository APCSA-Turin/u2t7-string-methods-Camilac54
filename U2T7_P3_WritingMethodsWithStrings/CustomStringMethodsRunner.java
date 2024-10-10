package U2T7_P3_WritingMethodsWithStrings;

public class CustomStringMethodsRunner {
   
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        
        boolean bool = methods.longerThan("story", 2);
        System.out.println(bool);

        String str1 = methods.funnyString("Arrakis", 5);
        System.out.println(str1);

        String str2 = methods.halvesReversed("Europa");
        System.out.println(str2);

        String str3 = methods.pigLatin("Neptune");
        System.out.println(str3);

        String str4 = methods.removeCharacter ("Woah there buddy!", 5);
        System.out.println(str4);

        String str5 = methods.insertAt("Congratulations!", "great", "lat");
        System.out.println(str5);

        String str6 = methods.endUp("Oh well that's just great...", 20);
        System.out.println(str6);

        String str7 = methods.yellOrWhisper("I said I'm not yelling!");
        System.out.println(str7);
    }
}