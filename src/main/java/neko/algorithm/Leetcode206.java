package neko.algorithm;

//反转一个单链表。
//
// 示例:
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
//
// 进阶:
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
// Related Topics 链表
// 👍 1652 👎 0

public class Leetcode206 {

  public static void main(String[] args) {
    ListNode l1n4 = new ListNode(5);
    ListNode l1n3 = new ListNode(4, l1n4);
    ListNode l1n2 = new ListNode(3, l1n3);
    ListNode l1n1 = new ListNode(2, l1n2);
    ListNode head = new ListNode(1, l1n1);
    Leetcode206 leetcode206 = new Leetcode206();
    ListNode result = leetcode206.reverseList(head);
  }

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}
