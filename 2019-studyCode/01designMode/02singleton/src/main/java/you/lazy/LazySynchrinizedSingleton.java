package main.java.you.lazy;

public class LazySynchrinizedSingleton {

  private LazySynchrinizedSingleton() {
  }

  private static LazySynchrinizedSingleton lazySingleton = null;

  //synchronized的关键字保证线程安全，但是synchronized 性能较低，虽然在JDK1.6做了相关性能的优化
  public synchronized static LazySynchrinizedSingleton getInstance() {
    if (lazySingleton == null) {
      return new LazySynchrinizedSingleton();
    }
    return lazySingleton;
  }
}
