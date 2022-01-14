// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <T> T[] invert(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}