package neko.algorithm;

//给定一个二叉树的根节点 root ，返回它的 中序 遍历。
//
//
//
// 示例 1：
//
//
//输入：root = [1,null,2,3]
//输出：[1,3,2]
//
//
// 示例 2：
//
//
//输入：root = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：root = [1]
//输出：[1]
//
//
// 示例 4：
//
//
//输入：root = [1,2]
//输出：[2,1]
//
//
// 示例 5：
//
//
//输入：root = [1,null,2]
//输出：[1,2]
//
//
//
//
// 提示：
//
//
// 树中节点数目在范围 [0, 100] 内
// -100 <= Node.val <= 100
//
//
//
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 哈希表
// 👍 904 👎 0

import java.util.ArrayList;
import java.util.List;
import sun.reflect.generics.tree.Tree;

public class Leetcode94 {

  public static void main(String[] args) {
    TreeNode rightLeft = new TreeNode(3);
    TreeNode right = new TreeNode(2, rightLeft, null);
    TreeNode root = new TreeNode(1, null, right);
    Leetcode94 leetcode94 = new Leetcode94();
    List<Integer> result = leetcode94.inorderTraversal(root);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if (root != null) {
      if (root.left != null) {
        List<Integer> leftResult = inorderTraversal(root.left);
        result.addAll(leftResult);
      }
      result.add(root.val);
      if (root.right != null) {
        List<Integer> rightResult = inorderTraversal(root.right);
        result.addAll(rightResult);
      }
    }
    return result;
  }
}
