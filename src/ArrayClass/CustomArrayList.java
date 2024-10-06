package ArrayClass;
import ArrayClass.InterfaceArray;
import java.util.Arrays;

public class CustomArrayList<A> implements InterfaceArray<A>{
  private Object[] array;
  private int size = 0;
  private final int N_CAPACITY = 17;

  public CustomArrayList() {
    array = new Object[N_CAPACITY];
  }

  @Override
  public void add(A new_variable) {
    if (new_variable == null) {
      throw new NullPointerException("Переменная равна Null");
    }
    if (size == N_CAPACITY) {
      array = Arrays.copyOf(array, array.length * 2);
    }
    array[size] = new_variable;
    ++size;
  }

  @Override
  public void remove(int ind) {
    if (ind < 0 || ind >= size)
      throw new IndexOutOfBoundsException("Неправильный индекс");
    System.arraycopy(array, ind + 1, array, ind, size - ind - 1);
    --size;
  }

  @Override
  public A get(int ind) {
    if (ind < 0 || ind >= size)
      throw new IndexOutOfBoundsException("Элемент с таким индексом не найден");
    return (A) array[ind];
  }
}