package neko.algorithm;

//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
// 假设一个二叉搜索树具有如下特征：
//
//
// 节点的左子树只包含小于当前节点的数。
// 节点的右子树只包含大于当前节点的数。
// 所有左子树和右子树自身必须也是二叉搜索树。
//
//
// 示例 1:
//
// 输入:
//    2
//   / \
//  1   3
//输出: true
//
//
// 示例 2:
//
// 输入:
//    5
//   / \
//  1   4
//     / \
//    3   6
//输出: false
//解释: 输入为: [5,1,4,null,null,3,6]。
//     根节点的值为 5 ，但是其右子节点值为 4 。
//
// Related Topics 树 深度优先搜索 递归
// 👍 1023 👎 0

import java.util.ArrayList;
import java.util.List;

public class Leetcode98 {

  public boolean isValidBST(TreeNode root) {
    boolean result = true;
    List<Integer>  nums = traversal(root);
    for (int i = 1; i < nums.size(); ++i) {
      if (nums.get(i - 1) >= nums.get(i)) {
        result = false;
      }
    }
    return result;
  }

  private List<Integer>  traversal(TreeNode root) {
    List<Integer> nums = new ArrayList<Integer>();
    if (root == null) {
      return nums;
    }
    nums.addAll(traversal(root.left));
    nums.add(root.val);
    nums.addAll(traversal(root.right));
    return nums;
  }


}
