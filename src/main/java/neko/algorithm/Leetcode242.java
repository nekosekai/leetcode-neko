package neko.algorithm;

import java.util.HashMap;
import java.util.Map;


//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表
// 👍 366 👎 0

public class Leetcode242 {

  public static void main(String[] args) {
    String s = "rat";
    String t = "car";
    Leetcode242 leetcode242 = new Leetcode242();
    boolean anagram = leetcode242.isAnagram(s, t);
    System.out.println(anagram);
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); ++i) {
      Character c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < t.length(); ++i) {
      Character c = t.charAt(i);
      map.put(c,  map.getOrDefault(c, 0) - 1);
      if (map.get(c) < 0) {
        return false;
      }
    }
    return true;
  }

}
