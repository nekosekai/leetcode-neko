package neko.algorithm;

//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
// 示例 1：
//
//
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
//
//
// 示例 2：
//
//
//输入：l1 = [], l2 = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：l1 = [], l2 = [0]
//输出：[0]
//
//
//
//
// 提示：
//
//
// 两个链表的节点数目范围是 [0, 50]
// -100 <= Node.val <= 100
// l1 和 l2 均按 非递减顺序 排列
//
// Related Topics 递归 链表
// 👍 1635 👎 0

public class Leetcode21 {

  public static void main(String[] args) {
    ListNode l1n3 = new ListNode(4);
    ListNode l1n2 = new ListNode(2, l1n3);
    ListNode l1n1 = new ListNode(1, l1n2);
    ListNode l2n3 = new ListNode(4);
    ListNode l2n2 = new ListNode(3, l2n3);
    ListNode l2n1 = new ListNode(1, l2n2);
    Leetcode21 leetcode21 = new Leetcode21();
    ListNode listNode = leetcode21.mergeTwoLists(l1n1, l2n1);
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}


