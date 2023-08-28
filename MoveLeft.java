package IntArray;

import java.util.Arrays;

public class MoveLeft {
    public static void main(String[] args) {
        int[] ar = {0,10, 50, 4, 5, 6, 2, 0, 0, 0, 12, 0};
        System.out.println("Before Array: "+ Arrays.toString(ar));
        for(int i=0;i<ar.length-1;i++)
        {
            for (int j=1;j<ar.length;j++) {
                if (ar[j]==0) {

                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;


                }
            }
        }
        System.out.println("After Sorted Array: "+ Arrays.toString(ar));
    }
}