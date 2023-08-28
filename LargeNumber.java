package IntArray;

import java.util.Arrays;

public class LargeNumber {
    public static void main(String[] args) {
        int[] ar={10,14,45,65,67,45};
        int max=ar[0];
        for (int i=0;i<=ar.length-1;i++)
        {
            if (ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}
