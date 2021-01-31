package lesson1;

public class Triangle extends Figure {

  private final Long a;
  private final Long b;
  private final Long c;

  @Override
  public Double square() {
    Double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  @Override
  public Double sideLength() {
    return Double.valueOf(a) + b + c;
  }

  public Triangle(Long a, Long b, Long c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
}