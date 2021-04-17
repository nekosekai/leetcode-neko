package neko.algorithm;

//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
//
//
// 示例 1：
//
//
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
//
//
// 示例 2：
//
//
//输入：n = 1
//输出：["()"]
//
//
//
//
// 提示：
//
//
// 1 <= n <= 8
//
// Related Topics 字符串 回溯算法
// 👍 1725 👎 0


import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {

  public static void main(String[] args) {
    Leetcode22 leetcode22 = new Leetcode22();
    List<String> strings = leetcode22.generateParenthesis(3);
    System.out.println(strings);
  }

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<String>();
    generate(0, 0, n, "", result);
    return result;
  }

  private void generate(int leftnum, int rightnum, int n, String s, List<String> result) {
    if (leftnum == n && rightnum == n) {
      result.add(s);
      return;
    }
    if (leftnum < n) {
      generate(leftnum + 1, rightnum, n, s + "(", result);
    }
    if (leftnum > rightnum) {
      generate(leftnum, rightnum + 1, n, s + ")", result);
    }
  }

}
