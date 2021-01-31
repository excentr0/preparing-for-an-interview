package lesson1;

public class Circle extends Figure {

  private final Long radius;

  @Override
  public Double square() {
    return Math.PI * (radius * radius);
  }

  @Override
  public Double sideLength() {
    return Math.PI * 2 * radius;
  }

  public Circle(Long radius) {
    this.radius = radius;
  }

}