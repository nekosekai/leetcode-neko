package neko.algorithm;


//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
// 示例:
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
// Related Topics 回溯算法
// 👍 561 👎 0


import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {

  public static void main(String[] args) {
    Leetcode77 leetcode77 = new Leetcode77();
    List<List<Integer>> combine = leetcode77.combine(4, 2);
    System.out.println(combine);
  }

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    dfs(result, n, k, new ArrayList<Integer>(), 1);
    return result;
  }

  private void dfs(List<List<Integer>> result, int n, int k, ArrayList<Integer> list, int index) {
    if (list.size() == k) {
      result.add(new ArrayList<>(list));
      return;
    }
    if (index <= n) {
      dfs(result, n, k, (ArrayList<Integer>) list.clone(), index + 1);
      list.add(index);
      dfs(result, n, k, (ArrayList<Integer>) list.clone(), index + 1);
    }
  }


}
