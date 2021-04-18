package neko.algorithm;

//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
//
//
// 示例 2：
//
//
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10
//
// Related Topics 回溯算法
// 👍 677 👎 0

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Leetcode47 {

  public static void main(String[] args) {
    Leetcode47 leetcode47 = new Leetcode47();
    List<List<Integer>> result1 = leetcode47.permuteUnique(new int[]{1, 1, 2});
    System.out.println(result1);
  }

  public List<List<Integer>> permuteUnique(int[] nums) {
    Set<List<Integer>> set = new HashSet<>();
    List<Integer> numlist = new ArrayList<>();
    int length = nums.length;
    for (int num : nums) {
      numlist.add(num);
    }
    recur(0, numlist, set, new ArrayList<Integer>(), length);
    List<List<Integer>> result = new ArrayList<>(set);
    return result;
  }

  private void recur(int index, List<Integer> numlist, Set<List<Integer>> result, ArrayList<Integer> list, int length) {
    if (index == length) {
      result.add(list);
      return;
    }
    for (int i = 0; i < numlist.size(); ++i) {
      list.add(numlist.get(i));
      List<Integer> temp = new ArrayList<>(numlist);
      temp.remove(numlist.get(i));
      recur(index + 1, temp, result, (ArrayList<Integer>) list.clone(), length);
      list.remove(list.size() - 1);
    }
  }

}
