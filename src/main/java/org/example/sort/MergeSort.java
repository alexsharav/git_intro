package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

  private static final int MAXIMUM = 52;

  public static List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> mergedList = new ArrayList<>();
    int i = 0, j = 0;

    while (i < left.size() || j < right.size()) {
      if (i == left.size()) {
        mergedList.add(right.get(j));
        j++;
      } else if (j == right.size()) {
        mergedList.add(left.get(i));
        i++;
      } else if (left.get(i) > right.get(j)) {
        mergedList.add(right.get(j));
        j++;
      } else {
        mergedList.add(left.get(i));
        i++;
      }
    }
    return mergedList;
  }

  @Override
  public List<Integer> sort(List<Integer> list) {
    if (list.size() > MAXIMUM) {
      throw new IllegalArgumentException("Over maxsize");
    }
    List<Integer> listMerge = new ArrayList<>(list);
    if (listMerge.size() < 2) {
      return listMerge;
    }

    int mid = listMerge.size() / 2;
    List<Integer> left = new ArrayList<>(list.subList(0, mid));
    List<Integer> right = new ArrayList<>(list.subList(mid, listMerge.size()));

    return merge(sort(left), sort(right));
  }
}

