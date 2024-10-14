package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import org.example.sort.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

  @Test
  void testMergeSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, 5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new MergeSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(0, 27, 52, 205, 731, 5213), sortedList);
    assertEquals(Arrays.asList(52, 27, 731, 205, 5213, 0), list);
    list = Arrays.asList(1, 1, 1, 1, 1, 1, 1);
    sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(1, 1, 1, 1, 1, 1, 1), sortedList);
    list = Arrays.asList(-328, -5328, -1283918984, -440122, 498, 634);
    sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-1283918984, -440122, -5328, -328, 498, 634), sortedList);
  }

  @Test
  void testBubbleSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, 5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new BubbleSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(0, 27, 52, 205, 731, 5213), sortedList);
    assertEquals(Arrays.asList(52, 27, 731, 205, 5213, 0), list);
    list = Arrays.asList(1, 1, 1, 1, 1, 1, 1);
    sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(1, 1, 1, 1, 1, 1, 1), sortedList);
    list = Arrays.asList(-328, -5328, -1283918984, -440122, 498, 634);
    sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-1283918984, -440122, -5328, -328, 498, 634), sortedList);
  }

  @Test
  void testSwitching() {
    List<Integer> unsortedList = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts currentSort = new JavaSorts(new MergeSort());
    currentSort.change_sort(new BubbleSort());
    List<Integer> bubbleSortedList = currentSort.sort(unsortedList);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), bubbleSortedList);
  }
}
