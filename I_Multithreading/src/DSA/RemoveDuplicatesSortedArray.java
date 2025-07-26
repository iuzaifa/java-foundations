package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++){
           integers.add(nums[i]);
            System.out.println(integers);
        }

        return integers.toArray().length;
    }
}
