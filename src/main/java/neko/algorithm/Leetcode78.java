package neko.algorithm;

//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//
//
// 示例 2：
//
//
//输入：nums = [0]
//输出：[[],[0]]
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// nums 中的所有元素 互不相同
//
// Related Topics 位运算 数组 回溯算法
// 👍 1140 👎 0

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {

  public static void main(String[] args) {
    Leetcode78 leetcode78 = new Leetcode78();
    List<List<Integer>> subsets = leetcode78.subsets(new int[]{1, 2, 3});
    System.out.println(subsets);
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums == null) {
      return result;
    }
    dfs(result, nums, new ArrayList<Integer>(), 0);
    return result;
  }

  private void dfs(List<List<Integer>> result, int[] nums, ArrayList<Integer> list, int index) {
    if (index == nums.length) {
      result.add(new ArrayList<>(list));
      return;
    }
    dfs(result, nums, (ArrayList<Integer>) list.clone(), index + 1);
    list.add(nums[index]);
    dfs(result, nums, (ArrayList<Integer>) list.clone(), index + 1);
  }

}
