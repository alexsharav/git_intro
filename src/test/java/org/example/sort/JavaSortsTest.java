package org.example.sort;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaSortsTest {

  @Test
  void testJavaMergeSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new MergeSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
  }

  @Test
  void testJavaBubbleSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new BubbleSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
  }

  @Test
  void testStrategySwitching() {
    List<Integer> unsortedList = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts currentSort = new JavaSorts(new MergeSort());
    List<Integer> mergeSortedList = currentSort.sort(unsortedList);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), mergeSortedList);

    unsortedList = Arrays.asList(52, 27, 731, 205, -5213, 0);
    currentSort.change_sort(new BubbleSort());
    List<Integer> bubbleSortedList = currentSort.sort(unsortedList);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), bubbleSortedList);
  }
}
