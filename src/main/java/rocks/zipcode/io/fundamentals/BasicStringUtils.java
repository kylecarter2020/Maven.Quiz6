package rocks.zipcode.io.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        Character[] c = new Character[chars.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = chars[i];
        }
        return getString(c);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c: chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        StringBuilder stringBuilder = new StringBuilder();

        for (char c: string.toCharArray()) {
            if(!vowels.contains(Character.toLowerCase(c))){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        for (char c: charactersToRemove.toCharArray()) {
            String ch = ""+c;
            string = string.replace(ch,"");
        }
        return string;
    }
}
