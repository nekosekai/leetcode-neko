package neko.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Project: leetcode-neko
 * Package: neko.algorithm 
 * User: neko
 * Date: 2021/04/08
 * Time: 22:34
 */
 
public class Leetcode239 {

  public static void main(String[] args) {
    Leetcode239 leetcode239 = new Leetcode239();
    int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
    int[] result = leetcode239.maxSlidingWindow(nums, 3);
    System.out.println(result);
  }

  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums.length == 0 || k == 0) {
      return new int[0];
    }
    int[] result = new int[nums.length - k + 1];
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    for(int i = 0; i < nums.length; ++i) {
      int start = i - k;
      if(start >= 0) {
        maxHeap.remove(nums[start]);
      }
      maxHeap.add(nums[i]);
      if(maxHeap.size() == k) {
        result[i - k + 1] = maxHeap.peek();
      }
    }
    return result;
  }

}
