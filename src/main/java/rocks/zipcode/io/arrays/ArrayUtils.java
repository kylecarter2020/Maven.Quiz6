package rocks.zipcode.io.arrays;

import rocks.zipcode.io.fundamentals.BasicStringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = start; i <= end ; i++) {
            range.add(i);
        }

        return range.toArray(new Integer[0]);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        String arrayAsString = BasicStringUtils.getString(array);
        char[] unboxed = new char[array.length];
        for (int i = 0; i < unboxed.length; i++) {
            unboxed[i] = arrayAsString.toCharArray()[i];
        }
        return unboxed;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        String arrayAsString = BasicStringUtils.getString(array);
        Character[] boxed = new Character[array.length];
        for (int i = 0; i < boxed.length; i++) {
            boxed[i] = arrayAsString.charAt(i);
        }
        return boxed;
    }
}
