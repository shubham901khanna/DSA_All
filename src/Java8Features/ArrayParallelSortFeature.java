package Java8Features;

import java.util.Arrays;

public class ArrayParallelSortFeature {

    public static void main(String[] args) {

        int num[] = {1, 3, 2, 33, 2, 44, 9};
        Arrays.parallelSort(num);

        // parallelSort() uses the concept of multithreading.

        Arrays.stream(num).forEach(s -> System.out.println(s));

    }


}
