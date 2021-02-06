package lesson2;

public class MyLinkedList {
  Node head;

  /**
   * Добавляем в конец списка.
   *
   * @param data данные
   */
  public void insert(int data) {
    Node newNode = new Node(data);
    if (this.head == null) {
      // Если список пустой, добавляем ноду в начало
      head = newNode;
    } else {
      // Если список не пустой
      Node currentNode = head;
      // Смещаемся в конец списка
      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      // Добавляем ноду в конец списка
      currentNode.setNext(newNode);
    }
  }

  /**
   * Добавляем в начало списка.
   *
   * @param data данные
   */
  public void insertHead(int data) {
    Node newNode = new Node(data); // Создаем новую ноду
    newNode.setNext(head); // указываем ее текущую первую ноду как следующую
    head = newNode; // первой нодой становиться newNode
  }

  /**
   * Удаляет нону по указанной позиции.
   *
   * @param index индекс удаляемой ноды
   */
  public void deleteNodeAt(int index) {
    Node node = head;
    // перемещаемся по списку до нужной по счету ноды
    for (int i = 0; i < index - 1; i++) {
      node = node.getNext();
    }
    // назначаем найденной ноде следующей ноду через одну вперед
    node.setNext(node.getNext().getNext());
  }

  /** Выводим содержимое списка. */
  public void show() {
    if (head != null) {
      Node currentNode = head;
      while (currentNode.getNext() != null) {
        System.out.print(currentNode.getData() + " ");
        currentNode = currentNode.getNext();
      }
      System.out.println(currentNode.getData());
    }
  }
}
