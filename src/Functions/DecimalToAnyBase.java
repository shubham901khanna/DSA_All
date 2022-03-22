package Functions;

import java.util.*;

public class DecimalToAnyBase {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int Num = getDecimalToAnyBase(n, b);
        System.out.println(Num);


    }

    public static int getDecimalToAnyBase(int n, int b) {

        int ans = 0;
        int p = 1; // 10^0
        while (n > 0) {

            int rem = n % b;
            n = n / b;

            // To print in reverse order
            ans = ans + rem * p;
            p = p * 10;

        }

        return ans;


    }


}
