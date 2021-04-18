package neko.algorithm;

//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
//
//
//
// 示例 1：
//
//
//输入：x = 2.00000, n = 10
//输出：1024.00000
//
//
// 示例 2：
//
//
//输入：x = 2.10000, n = 3
//输出：9.26100
//
//
// 示例 3：
//
//
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2-2 = 1/22 = 1/4 = 0.25
//
//
//
//
// 提示：
//
//
// -100.0 < x < 100.0
// -231 <= n <= 231-1
// -104 <= xn <= 104
//
// Related Topics 数学 二分查找
// 👍 635 👎 0
 
public class Leetcode50 {

  public static void main(String[] args) {
    Leetcode50 leetcode50 = new Leetcode50();
    double result = leetcode50.myPow(2.0d, 10);
    System.out.println(result);
  }

  public double myPow(double x, int n) {
    long pow = n;
    if (pow < 0) {
      x = 1 / x;
      pow = -pow;
    }
    return fastPow(x, pow);
  }

  private double fastPow(double x, long pow) {
    if (pow == 0) {
      return 1.0;
    }
    double half = fastPow(x, pow / 2);
    if (pow % 2 == 1) {
      return half * half * x;
    } else {
      return half * half;
    }
  }

}
