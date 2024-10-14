package org.example.sort;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

  @Test
  public void testBubbleSort() {
    BubbleSort bubbleSortStrategy = new BubbleSort();
    List<Integer> unsortedList = Arrays.asList(5, 2, 9, 1, 5, 6);
    List<Integer> sortedList = bubbleSortStrategy.sort(unsortedList);
    assertEquals(Arrays.asList(1, 2, 5, 5, 6, 9), sortedList);
  }
}
