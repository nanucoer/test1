package IntArray;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] ar={10,3,2,0,0,0,1,0,0,12,34};
        System.out.println("Before Array: "+ Arrays.toString(ar));
        for(int i=0;i<ar.length-1;i++)
        {
          for (int j=0;j<ar.length-1;j++) {
              if (ar[j] > ar[j + 1]) {
                  int temp = ar[j];
                  ar[j] = ar[j + 1];
                  ar[j + 1] = temp;
              }
          }
        }
        System.out.println("After Sorted Array: "+ Arrays.toString(ar));

    }

}
