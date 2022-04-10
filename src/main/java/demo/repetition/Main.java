package repetition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 3, 2, 3, 4, 5};
        arr = Arrays.stream(arr).map(i -> {
            i = (i == 1) ? 20 : i;
            return i;
        }).toArray();
        Arrays.stream(arr).forEach(System.out::println);
    }

}
