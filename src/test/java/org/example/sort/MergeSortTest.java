package org.example.sort;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

  @Test
  public void testMergeSort() {
    MergeSort mergeSortStrategy = new MergeSort();
    List<Integer> unsortedList = Arrays.asList(52, 27, 731, 205, -5213, 0);
    List<Integer> sortedList = mergeSortStrategy.sort(unsortedList);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
  }
}
