package InterviewQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

// {54, 546, 548, 60}, the arrangement 6054854654
public class ArrayForm {

    static void printLargest(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });

       Iterator i = arr.iterator();
       while(i.hasNext()) {
           System.out.print(i.next());
       }


    }

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("54");
        vec.add("546");
        vec.add("548");
        vec.add("60");
        printLargest(vec);

    }
}

