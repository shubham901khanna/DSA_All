package Stack;

import java.util.*;

public class Genericexp {


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,82,1,2);
        System.out.println("size of list1" + sum(list1));

        List<Double> list2 = Arrays.asList(1.2,3.2,8.2);
        System.out.println("sum of list2" + sum(list2));
    }

    private static double sum(List<? extends Number> list) {

        double sum = 0.0;
        for(Number i : list) {
            sum = sum + i.doubleValue();
        }

        return sum;

    }


}
