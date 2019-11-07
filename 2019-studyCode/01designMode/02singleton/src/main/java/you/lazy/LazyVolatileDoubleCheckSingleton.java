package main.java.you.lazy;

public class LazyVolatileDoubleCheckSingleton {

  private LazyVolatileDoubleCheckSingleton() {
  }

  //volatile解决JVM指令重排序问题
  private volatile static LazyVolatileDoubleCheckSingleton lazySingleton = null;

  public static LazyVolatileDoubleCheckSingleton getInstance() {
    if (lazySingleton == null) {
      synchronized (LazyVolatileDoubleCheckSingleton.class) {
        if (lazySingleton == null) {
          return new LazyVolatileDoubleCheckSingleton();
        }
      }
    }
    return lazySingleton;
  }
}
