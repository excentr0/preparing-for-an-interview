package lesson2;

import java.util.Arrays;

public class MyArrayList {
  private static final int INITIAL_CAPACITY = 10; // начальная емкость массива
  private int size; // размер массива
  private Object[] arrayData; // сам массив

  public MyArrayList() {
    arrayData = new Object[INITIAL_CAPACITY];
  }

  /**
   * Добавляем объект.
   *
   * @param e добавляемый объект*/
  public void add(Object e) {
    if (size == arrayData.length) {
      increaseCapacity();
    }
    arrayData[size++] = e;
  }

  /**
   * Получаем объект.
   *
   * @param index индекс получаемого объекта
   * @return объект
   */
  public Object get(int index) {
    checkArrayBounds(index);
    return arrayData[index];
  }

  /**
   * Проверяем, что индекс не выхожит за пределы массива.
   *
   * @param index индекс эелемента
   * */
  private void checkArrayBounds(int index) {
    if (index <0 || index > size) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of size " + size);
    }
  }

  /**
   * Удаляет объект из массива и возвразает его.
   *
   * @param index индекс эелемента
   * @return удаленный объект
   */
  public Object remove(int index) {
    checkArrayBounds(index);
    Object element = arrayData[index];
    if (size - 1 - index >= 0) System.arraycopy(arrayData, index + 1, arrayData, index, size - 1 - index);
    size--;
    return element;
  }

  /** Выводит содержиоме массива. */
  public void show() {
    for (int i = 0; i < size; i++) {
      System.out.print(arrayData[i] + " ");
    }
    System.out.println();
  }

  /** Увеличивает ёмкость массива. */
  private void increaseCapacity() {
    int newCapacity = arrayData.length * 2;
    arrayData = Arrays.copyOf(arrayData, newCapacity);
  }
}
