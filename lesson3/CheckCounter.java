package lesson3;

public class CheckCounter {

  public static void main(String[] args) throws InterruptedException {
    MyCounter counter = new MyCounter();

    Thread t1 =
        new Thread(
            () -> {
              for (int i = 0; i < 100; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " " + counter.increaseAndGet());
              }
            });
    Thread t2 =
        new Thread(
            () -> {
              for (int i = 0; i < 100; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " " + counter.increaseAndGet());
              }
            });
    Thread t3 =
        new Thread(
            () -> {
              for (int i = 0; i < 100; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " " + counter.increaseAndGet());
              }
            });

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    System.out.println(counter.get());
  }
}
