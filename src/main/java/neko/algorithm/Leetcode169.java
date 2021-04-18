package neko.algorithm;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1：
//
//
//输入：[3,2,3]
//输出：3
//
// 示例 2：
//
//
//输入：[2,2,1,1,1,2,2]
//输出：2
//
//
//
//
// 进阶：
//
//
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
//
// Related Topics 位运算 数组 分治算法
// 👍 956 👎 0


import java.util.HashMap;
import java.util.Map;

public class Leetcode169 {

  public static void main(String[] args) {
    Leetcode169 leetcode169 = new Leetcode169();
    int i = leetcode169.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
    System.out.println(i);
  }

  public int majorityElement(int[] nums) {
    int mid = nums.length / 2;
    int result = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
      if (map.get(i) > mid) {
        return i;
      }
    }
    return result;
  }

}
