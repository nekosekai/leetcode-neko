package neko.algorithm;

import java.util.ArrayList;
import java.util.List;

//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
//
//
//
// 示例 1：
//
//
//输入：root = [1,null,2,3]
//输出：[1,2,3]
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
//输出：[1,2]
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
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树
// 👍 553 👎 0
public class Leetcode144 {

  public static void main(String[] args) {
    TreeNode rightLeft = new TreeNode(3);
    TreeNode right = new TreeNode(2, rightLeft, null);
    TreeNode root = new TreeNode(1, null, right);
    Leetcode144 leetcode144 = new Leetcode144();
    List<Integer> result = leetcode144.preorderTraversal(root);
    System.out.println(result);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if (root != null) {
      result.add(root.val);
      if (root.left != null) {
        result.addAll(preorderTraversal(root.left));
      }
      if (root.right != null) {
        result.addAll(preorderTraversal(root.right));
      }
    }
    return result;
  }
}
