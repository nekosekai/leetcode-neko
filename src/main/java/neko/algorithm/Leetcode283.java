package neko.algorithm;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 1010 👎 0

public class Leetcode283 {

  public static void main(String[] args) {
    Leetcode283 leetcode283 = new Leetcode283();
    int[] arr = new int[]{0, 1, 0, 3, 12};
    leetcode283.moveZeroes(arr);
  }

  //  public void moveZeroes(int[] nums) {
  //    for (int i = 0; i < nums.length - 1; i++) {
  //      for (int j = 0; j < nums.length - 1 - i; j++) {
  //        if (nums[j] == 0) {
  //          int temp = nums[j];
  //          nums[j] = nums[j + 1];
  //          nums[j + 1] = temp;
  //        }
  //      }
  //    }
  //  }

  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i <= nums.length; ++i) {
      if (nums[i] != 0) {
        nums[j] = nums[i];
        if (i != j) {
          nums[i] = 0;
        }
        j++;
      }
    }
  }

}
