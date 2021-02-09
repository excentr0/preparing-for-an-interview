package lesson3;

public class ThreadedPingPong {

  public static void main(String[] args) {
    MyLock myLock = new MyLock();
    Thread t1 =
        new Thread(
            () -> {
              try {
                synchronized (myLock) {
                  while (true) {
                    while (myLock.getThreadNum() != 1) {
                      myLock.wait();
                    }
                    System.out.println("Ping 1");
                    myLock.wait(500);
                    myLock.setThreadNum(2);
                    myLock.notifyAll();
                  }
                }
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
    Thread t2 =
        new Thread(
            () -> {
              try {
                synchronized (myLock) {
                  while (true) {
                    while (myLock.getThreadNum() != 2) {
                      myLock.wait();
                    }
                    System.out.println("Ping 2");
                    myLock.wait(500);
                    myLock.setThreadNum(1);
                    myLock.notifyAll();
                  }
                }
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });

    t1.start();
    t2.start();
  }
}
