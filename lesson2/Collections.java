package lesson2;

public class Collections {
  public static void main(String[] args) {
    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    myArrayList.show();
    System.out.println(myArrayList.get(1));
    System.out.println(myArrayList.remove(1));
    myArrayList.show();

    System.out.println("===============================");

    MyLinkedList list = new MyLinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.show();
    list.insertHead(10);
    list.show();
    list.deleteNodeAt(2);
    list.show();
  }
}
