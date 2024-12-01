public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lower = ""; //initialize empty string
        for (int i=0 ; i<str.length(); i++){ //loop over str
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){ //if uppercase
                lower += (char) (str.charAt(i)+32); //convert to lower and add
            } else { //if lowercase
                lower += str.charAt(i); //concatenate to string
            }
        }
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() == 0 || str2.length()>str1.length()){ //if str1 is empty or str2>str1
            return false;
        } else if (str2.length() == 0){ //if str2 empty
            return true;
        }
        for (int i = 0 ; i<=str1.length()-str2.length() ; i++){ //loop over str1 until there sint space for str2
            Boolean match = true;
            for (int j =0 ; j<str2.length() ; j++){ // loop over str2
                if (str1.charAt(i+j) != str2.charAt(j)){ //checks for mismatch. if non, will stay true
                    match = false;
                    break; //exit inner loop 
                }
            }
            if (match){
                return true;
            }
        }
        return false;
    }
}
