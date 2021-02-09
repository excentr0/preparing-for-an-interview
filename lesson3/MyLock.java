package lesson3;

public class MyLock {
  private volatile int threadNum = 1;

  public int getThreadNum() {
    return threadNum;
  }

  public void setThreadNum(int threadNum) {
    this.threadNum = threadNum;
  }
}
