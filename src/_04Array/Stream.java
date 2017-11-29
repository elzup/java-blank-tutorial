package _04Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

  static List<Integer> arrayStreamMap(List<Integer> nums) {
    // FIXME: map! to the double
    List<Integer> doubled = nums.stream().map(v -> v * 3).collect(Collectors.toList());
    return doubled;
  }

  static List<Integer> arrayStreamMap2(List<Integer> nums) {
    // FIXME: Refactor by stream, map
    List<Integer> nums2 = new ArrayList<>();
    for (int n : nums) {
      nums2.add(n * 4 + 123);
    }
    return nums2;
  }

  static List<Integer> arrayStreamFilter(List<Integer> nums) {
    // FIXME: filter! only less than 10
    List<Integer> smalls = nums.stream().filter(v -> v < 100).collect(Collectors.toList());
    return smalls;
  }

  static List<Integer> arrayStreamFilter2(List<Integer> nums) {
    // FIXME: Refactor by stream, filter
    List<Integer> nums2 = new ArrayList<>();
    for (int n : nums) {
      if (n < 40) {
        nums2.add(n);
      }
    }
    return nums2;
  }

  static List<String> arrayStreamCombination(List<Integer> nums) {
    // FIXME: As follows
    //                    [10, 25, 50, 15, 45, 60, 95]
    // map double      -> [20, 50, 100, 30, 90, 120, 190]
    // ignore over 100 -> [20, 50, 30, 90]
    // sort            -> [20, 30, 50, 90]
    // map decoration  -> ["<20>", "<50>", "<30>", "<90>"]
    return nums.stream().sorted().map(v -> String.format("(%d)", v)).collect(Collectors.toList());
  }
}
