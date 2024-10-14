package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sort {

  private static final int MAXIMUM = 52;

  @Override
  public List<Integer> sort(List<Integer> list) {
    if (list.size() > MAXIMUM) {
      throw new IllegalArgumentException("Список слишком велик для сортировки");
    }
    List<Integer> listBubble = new ArrayList<>(list);
    int n = listBubble.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (listBubble.get(j) > listBubble.get(j + 1)) {
          Integer temp = listBubble.get(j);
          listBubble.set(j, listBubble.get(j + 1));
          listBubble.set(j + 1, temp);
        }
      }
    }
    return listBubble;
  }
}
