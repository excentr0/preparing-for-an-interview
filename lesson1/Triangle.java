package lesson1;

public class Triangle extends Figure {

  private Long a;
  private Long b;
  private Long c;

  @Override
  public Double square() {
    Double p = (a + b + c) / Double.valueOf(2);
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