package neko.algorithm;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//
//
// 示例 2：
//
//
//输入：nums = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：nums = [0]
//输出：[]
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105
//
// Related Topics 数组 双指针
// 👍 3184 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {

  public static void main(String[] args) {
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
    Leetcode15 leetcode15 = new Leetcode15();
    List<List<Integer>> result = leetcode15.threeSum(nums);
  }

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int k = 0; k < nums.length - 2; ++k) {
      if (nums[k] > 0) {
        // 因为数组排好序，如果 nums[k] > 0, 那么nums[i]和nums[j]都大于0，不存在等于-nums[k]的情况
        break;
      }
      if (k > 0 && nums[k] == nums[k - 1]) {
        continue;
      }
      for (int i = k + 1, j = nums.length - 1; i < j; ) {
        int sum = nums[k] + nums[i] + nums[j];
        if (sum < 0) {
          i++;
        } else if (sum > 0) {
          j--;
        } else {
          res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
          while (i < j && nums[i] == nums[i + 1]) {
            i++;
          }
          while (i < j && nums[j] == nums[j - 1]) {
            j--;
          }
          i++;
          j--;
        }
      }
    }
    return res;
  }
}
