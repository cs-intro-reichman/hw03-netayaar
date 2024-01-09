/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String newStr = "";
        char ch ;
        for (int i = 0; i < s.length(); i++) {
        // check is char at index i is a letter
            if (Character.isLetter(s.charAt(i))) {
        // checks if char at index i is uppercase
                if ((s.charAt(i) >= 'A') && (s.charAt(i)<= 'Z')) {
                    ch = Character.toLowerCase(s.charAt(i));
                } else {
                    ch = s.charAt(i);
                }
            } else {
                ch = s.charAt(i);
            }

            newStr += ch;
        }
        return newStr;
    }
}