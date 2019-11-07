package main.java.you.lazy;

public class LazyDoubleCheckSingleton {

  private LazyDoubleCheckSingleton() {
  }

  private static LazyDoubleCheckSingleton lazySingleton = null;

  //双重锁校验，虽然比前面一种直接在getInstance加synchronize关键字效率高，但是
  //任然使用了synchronize关键字
  public static LazyDoubleCheckSingleton getInstance() {
    if (lazySingleton == null) {
      synchronized (LazyDoubleCheckSingleton.class) {
        if (lazySingleton == null) {
          return new LazyDoubleCheckSingleton();
        }
      }
    }
    return lazySingleton;
  }
}
