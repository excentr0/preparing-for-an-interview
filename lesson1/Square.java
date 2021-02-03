package lesson1;

public class Square extends Figure {

  private final Double side;

  @Override
  public Double square() {
    return side * side;
  }

  @Override
  public Double sideLength() {
    return 4 * side;
  }

  public Square(Double side) {
    this.side = side;
  }

}