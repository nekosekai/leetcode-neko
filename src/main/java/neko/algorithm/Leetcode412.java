package neko.algorithm;


import java.util.ArrayList;
import java.util.List;

//写一个程序，输出从 1 到 n 数字的字符串表示。
//
// 1. 如果 n 是3的倍数，输出“Fizz”；
//
// 2. 如果 n 是5的倍数，输出“Buzz”；
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
//
// 示例：
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
//
// 👍 94 👎 0

public class Leetcode412 {

  public static void main(String[] args) {
    Leetcode412 leetcode412 = new Leetcode412();
    List<String> result = leetcode412.fizzBuzz(15);
    System.out.println(result);
  }

  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= n; ++i) {
      if (i % 15 == 0) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        result.add(i + "");
      }
    }
    return result;
  }
}
