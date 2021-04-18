package neko.algorithm;

//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//
// 示例:
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// Related Topics 回溯算法
// 👍 1301 👎 0

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

  public static void main(String[] args) {
    Leetcode46 leetcode46 = new Leetcode46();
    List<List<Integer>> result = leetcode46.permute(new int[]{1, 2, 3});
    System.out.println(result);
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    recur(0, nums, result, new ArrayList<Integer>());
    return result;
  }

  private void recur(int index, int[] nums, List<List<Integer>> result, ArrayList<Integer> list) {
    if (index == nums.length) {
      result.add(new ArrayList<Integer>(list));
      return;
    }
    for (int i = 0; i < nums.length; ++i) {
      if (list.contains(nums[i])) {
        continue;
      }
      list.add(nums[i]);
      recur(index + 1, nums, result, (ArrayList<Integer>) list.clone());
      list.remove(list.size() - 1);
    }
  }


}
