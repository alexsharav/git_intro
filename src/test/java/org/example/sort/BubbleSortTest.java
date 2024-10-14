package org.example.sort;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

  @Test
  void testBubbleSort() {
    BubbleSort bubbleSortStrategy = new BubbleSort();
    List<Integer> unsortedList = Arrays.asList(5, 2, 9, 1, 5, 6);
    List<Integer> sortedList = bubbleSortStrategy.sort(unsortedList);
    assertEquals(Arrays.asList(1, 2, 5, 5, 6, 9), sortedList);
  }

  @Test
  void testBubbleSortWithLargeList() {
    BubbleSort sorting_type = new BubbleSort();
    List<Integer> largeList = Arrays.asList(new Integer[101]);
    assertThrows(IllegalArgumentException.class, () -> sorting_type.sort(largeList));
  }
}
