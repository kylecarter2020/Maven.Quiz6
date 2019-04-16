package rocks.zipcode.io.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
        ArrayList<T> collectionAsList = new ArrayList<>(collection);
        return collectionAsList.toArray((T[]) Array.newInstance(collectionAsList.get(0).getClass(),collectionAsList.size()));
    }
}
