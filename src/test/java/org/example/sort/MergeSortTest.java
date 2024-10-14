package org.example.sort;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

  @Test
  void testMergeSort() {
    MergeSort mergeSortStrategy = new MergeSort();
    List<Integer> unsortedList = Arrays.asList(52, 27, 731, 205, -5213, 0);
    List<Integer> sortedList = mergeSortStrategy.sort(unsortedList);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
  }

  @Test
  void testMergeSortWithLargeList() {
    MergeSort sorting_type = new MergeSort();
    List<Integer> largeList = Arrays.asList(new Integer[101]);
    assertThrows(IllegalArgumentException.class, () -> sorting_type.sort(largeList));
  }
}
