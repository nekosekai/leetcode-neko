package neko.algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Leetcode350 {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 2, 1};
    int[] nums2 = new int[]{2, 2};
    Leetcode350 leetcode350 = new Leetcode350();
    int[] intersect = leetcode350.intersect(nums1, nums2);
    System.out.println(intersect);
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
      return new int[0];
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : nums1) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    List<Integer> temp = new ArrayList<Integer>();
    for (int i : nums2) {
      if (map.containsKey(i) && map.get(i) > 0) {
        temp.add(i);
        map.put(i, map.get(i) - 1);
      }
    }
    int[] resutl =  temp.stream().mapToInt(Integer::valueOf).toArray();
    return resutl;
  }
}
