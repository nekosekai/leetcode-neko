package neko.algorithm;

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
//
//
// 示例 2：
//
//
//输入：head = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1]
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 100] 内
// 0 <= Node.val <= 100
//
//
//
//
// 进阶：你能在不修改链表节点值的情况下解决这个问题吗?（也就是说，仅修改节点本身。）
// Related Topics 递归 链表
// 👍 870 👎 0
public class Leetcode24 {

  public static void main(String[] args) {
    //输入：head = [1,2,3,4]
    //输出：[2,1,4,3]
    ListNode l1n3 = new ListNode(4);
    ListNode l1n2 = new ListNode(3, l1n3);
    ListNode l1n1 = new ListNode(2, l1n2);
    ListNode head = new ListNode(1, l1n1);
    Leetcode24 leetcode24 = new Leetcode24();
    ListNode node = leetcode24.swapPairs(head);
  }

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode n = head.next;
    head.next = swapPairs(n.next);
    n.next = head;
    return n;
  }
}


