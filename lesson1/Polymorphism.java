package lesson1;

public class Polymorphism {
  public static void main(String[] args) {
    Figure figure = new Figure();
    System.out.println(figure.square());
    System.out.println(figure.sideLength());

    Circle circle = new Circle(10L);
    System.out.println(circle.square());
    System.out.println(circle.sideLength());

    Square square = new Square(10.0);
    System.out.println(square.square());
    System.out.println(square.sideLength());

    Triangle triangle = new Triangle(1L, 2L, 3L);
    System.out.println(triangle.square());
    System.out.println(triangle.sideLength());
  }
}