package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import org.example.sort.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

  @Test
  public void testMergeSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new MergeSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
    assertEquals(Arrays.asList(52, 27, 731, 205, -5213, 0), list);
  }

  @Test
  public void testBubbleSort() {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts SortingTypes = new JavaSorts(new BubbleSort());
    List<Integer> sortedList = SortingTypes.sort(list);
    assertEquals(Arrays.asList(-5213, 0, 27, 52, 205, 731), sortedList);
    assertEquals(Arrays.asList(52, 27, 731, 205, -5213, 0), list);
  }
}
