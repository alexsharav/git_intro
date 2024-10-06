import ArrayClass.CustomArrayList;

public class Main {
  public static void main(String[] args) {
    CustomArrayList<Integer> arr = new CustomArrayList<>();
    arr.add(2152);
    System.out.println(arr.get(0));
    arr.add(234);
    System.out.println(arr.get(0));
    arr.remove(0);
    System.out.println(arr.get(0));
  }
}