package org.example;

import java.util.Arrays;
import java.util.List;
import org.example.sort.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(52, 27, 731, 205, -5213, 0);
    JavaSorts ChooseSort = new JavaSorts(new MergeSort());
    System.out.println("Default sort: MergeSort.");
    System.out.println("MergeSort example: " + ChooseSort.sort(list));
    System.out.println("List after MergeSort: " + list);
    ChooseSort.change_sort(new BubbleSort());
    System.out.println("BubbleSort example: " + ChooseSort.sort(list));
    System.out.println("List after BubbleSort: " + list);
  }
}