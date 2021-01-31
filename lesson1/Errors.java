package lesson1;

interface Moveable {
  void move();
}

interface Stopable {
  void stop();
}

abstract class Car {
  private Engine engine; // Лучше сделать поле приватным, а доступ к полю сделать через
                         // геттер и сеттер
  private String color;
  private String name;

  protected void start() {
    System.out.println("Car starting");
  }

  abstract void open();

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class LightWeightCar extends Car implements Moveable {

  @Override
  void open() {
    System.out.println("Car is open");
  }

  @Override
  public void move() {
    System.out.println("Car is moving");
  }

}

// Нельзя наследоваться от более чем 1-го класса, следует использовать
// интерфейсы
// class Lorry extends Car, Moveable, Stopable{
class Lorry extends Car implements Moveable, Stopable {

  public void move() {
    System.out.println("Car is moving");
  }

  public void stop() {
    System.out.println("Car is stop");
  }

  // Не хватало абстрактного метода open класса Car, который необзодимо
  // переопределить
  @Override
  void open() {
    System.out.println("Lorry is open");
  }
}
