package homeWork.Lesson6;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int [] [] nums = {
                {7, 1, 2},
                {5, 4, 3},
                {9, 6, 8}
        };


        for (int i=0; i<nums.length; i++) {
            Arrays.sort(nums[i]);
        }

        for (int [] num : nums) {
            for (int value : num) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

