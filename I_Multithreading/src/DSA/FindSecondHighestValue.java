package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondHighestValue {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 7,9,11,7};

        System.out.println(getSecondHeightValue(arr)); // ?
//        System.out.println(Arrays.toString(getSort(arr))); // ?

    }

    public static int getSecondHeightValue(int[] arr) {
        int [] sorted = getSort(arr);
        int n = 3; // n = 2, n = 3, n = 4, ..... n = n;
        return sorted[sorted.length-n];
    }
    public static int [] getSort(int[] arr){
        int[] sort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sort[i] = arr[i];
        }
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        return sort;
    }

}
