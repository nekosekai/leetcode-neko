package neko.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
//
//
//
// 示例：
//二叉树：[3,9,20,null,null,15,7],
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//
// 返回其层序遍历结果：
//
//
//[
//  [3],
//  [9,20],
//  [15,7]
//]
//
// Related Topics 树 广度优先搜索
// 👍 847 👎 0

 
public class Leetcode102 {

  public static void main(String[] args) {
    Leetcode102 leetcode102 = new Leetcode102();
    TreeNode level3Left = new TreeNode(15, null, null);
    TreeNode level3Right = new TreeNode(7, null, null);
    TreeNode level2Left = new TreeNode(9, null, null);
    TreeNode level2Right = new TreeNode(20, level3Left, level3Right);
    TreeNode root = new TreeNode(3, level2Left, level2Right);
    List<List<Integer>> lists = leetcode102.levelOrder(root);
    System.out.println(lists);

  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Deque<TreeNode> nodes = new ArrayDeque<TreeNode>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      int size = nodes.size();
      List<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {
        TreeNode node = nodes.poll();
        result.add(node.val);
        if (node.left != null) {
          nodes.add(node.left);
        }
        if (node.right != null) {
          nodes.add(node.right);
        }
      }
      res.add(result);
    }
    return res;
  }

}
