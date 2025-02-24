public String conCat(String s1, String s2){
    String lastLetter = s1.substring(s1.length() - 1);
    String firstLetter = s2.substring(0, 1);


    if (s1.isEmpty() || s2.isEmpty()){
        return s1 + s2;
    }


    if (firstLetter.equals(lastLetter)){
        return (s1.substring(0, s1.length() - 1)) + s2;
    }
   
    return s1 + s2;
}
