package org.example.sort;

import java.util.List;

public class JavaSorts implements Sort {

  private Sort sortType;

  public JavaSorts(Sort sortType) {
    this.sortType = sortType;
  }

  @Override
  public List<Integer> sort(List<Integer> list) {

    return sortType.sort(list);
  }

  public void change_sort(Sort sortType) {
    System.out.println("Switched sort class to: " + sortType);
    this.sortType = sortType;
  }
  public Sort get_sort() {
    return sortType;
  }
}
