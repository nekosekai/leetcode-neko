package neko.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

//字典 wordList 中从单词 beginWord 和 endWord 的 转换序列 是一个按下述规格形成的序列：
//
//
// 序列中第一个单词是 beginWord 。
// 序列中最后一个单词是 endWord 。
// 每次转换只能改变一个字母。
// 转换过程中的中间单词必须是字典 wordList 中的单词。
//
//
// 给你两个单词 beginWord 和 endWord 和一个字典 wordList ，找到从 beginWord 到 endWord 的 最短转换序列 中
//的 单词数目 。如果不存在这样的转换序列，返回 0。
//
//
// 示例 1：
//
//
//输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","lo
//g","cog"]
//输出：5
//解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
//
//
// 示例 2：
//
//
//输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","lo
//g"]
//输出：0
//解释：endWord "cog" 不在字典中，所以无法进行转换。
//
//
//
// 提示：
//
//
// 1 <= beginWord.length <= 10
// endWord.length == beginWord.length
// 1 <= wordList.length <= 5000
// wordList[i].length == beginWord.length
// beginWord、endWord 和 wordList[i] 由小写英文字母组成
// beginWord != endWord
// wordList 中的所有字符串 互不相同
//
// Related Topics 广度优先搜索
// 👍 748 👎 0
 
public class Leetcode127 {

  public static void main(String[] args) {
    Leetcode127 leetcode127 = new Leetcode127();
    List<String> wordList = new ArrayList<String>();
    wordList.add("hot");
    wordList.add("dot");
    wordList.add("dog");
    wordList.add("lot");
    wordList.add("log");
    wordList.add("cog");
    int i = leetcode127.ladderLength("hit", "cog", wordList);
    System.out.println(i);
  }

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    HashSet<String> set = new HashSet<String>();
    set.addAll(wordList);
    if (!set.contains(endWord)) {
      return 0;
    }
    set.remove(beginWord);
    Deque<String> queue = new ArrayDeque<String>();
    queue.add(beginWord);
    int step = 1;
    char[] dict = new char[26];
    for (char i = 0; i < 26; ++i) {
      dict[i] = (char) ('a' + i);
    }
    while (!queue.isEmpty()) {
      ++step;
      for (int count = queue.size(); count > 0; --count) {
        String tempWord = queue.poll();
        char[] tempArr = tempWord.toCharArray();
        for (int i = 0; i < tempArr.length; ++i) {
          char old = tempArr[i];
          for (int j = 0; j < dict.length; ++j) {
            tempArr[i] = dict[j];
            String newWord = new String(tempArr);
            if (endWord.equals(newWord)) {
              return step;
            } else if (set.contains(newWord)) {
              queue.add(newWord);
              set.remove(newWord);
            }
          }
          tempArr[i] = old;
        }
      }
    }
    return 0;
  }
}
