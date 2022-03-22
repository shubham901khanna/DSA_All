package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Monitor", 9000);
        Product p2 = new Product("UPS", 4000);
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Printer", 3000);
        Product p5 = new Product("USB", 1000);
        Product p6 = new Product("KeyBoard", 1500);
        List<Product> list = Arrays.asList(p1,p2,p3,p4,p5,p6);

         List<Product> result = list.stream().filter(p -> p.getPrice() > 1500).collect(Collectors.toList());
         System.out.println(result);
        /*String sentence = "i am a java full stack developer";
        String[] str = sentence.split(" "); // am*/
        /*for(String s: str) {
            s.charAt(str);
            s.toUpperCase(); // I
        }*/




    }
}
