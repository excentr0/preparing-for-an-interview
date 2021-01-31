package lesson1;

public class Circle extends Figure {

  private Long raduis;

  @Override
  public Double square() {
    return Math.PI * (raduis * raduis);
  }

  @Override
  public Double sideLength() {
    return Math.PI * 2 * raduis;
  }

  public Circle(Long raduis) {
    this.raduis = raduis;
  }

}