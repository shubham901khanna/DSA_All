package Stack;

import java.util.Arrays;

public class PairSum {

  public  static void getPairSums(int arr[], int len, int sum) {
      Arrays.sort(arr);
      int li = 0;
      int ri = arr.length - 1;
      while(li < ri) {
          if(arr[li] + arr[ri] < sum) {
              li ++;

          } else if(arr[li] + arr[ri] > sum) {
              ri --;
          } else {

              System.out.println(arr[li] + "," + arr[ri]);
              li ++;
              ri --;
          }
      }
  }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 7, -1, 5};
        int len = arr.length;
        int sum = 6;
        getPairSums(arr,len,sum);
    }

}
