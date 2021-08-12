package com.christianpari;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
    if(indices != null) {
      System.out.println(indices[0] + " " + indices[1]);
    }
  }

  public static int[] findTwoSum(int[] list, int sum) {
    HashMap<Integer, Integer> listMap = new HashMap<>();
    for (int i = 0; i < list.length; i++) {
      int curVal = list[i];
      int needs = sum - curVal;
      if (listMap.containsKey(needs))
        return new int[]{i, listMap.get(needs)};
      listMap.put(curVal, i);
    }
    return null;
  }
}
