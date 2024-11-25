package LeetCode;

import java.util.Arrays;

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSome {
  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 14 };
    int target = 1;

    TwoSome tw = new TwoSome();
    int[] a = tw.twoSome(nums, target);
    if (a.length == 0) {
      System.out.println("Sorry..NO MATCHING INDICES");
    } else {
      System.out.println("Indices : " + Arrays.toString(a));
    }
  }
  public int[] twoSome(int[] nums, int target) {
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          int[] arr = new int[] { i, j };
          return arr;
        }

      }
    }
    return new int[] {};
  }

}
