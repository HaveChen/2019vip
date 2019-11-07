package main.java.you.lazy;

public class LazySingleton {

  //懒汉式单例
  //解决了饿汉式单例加载资源浪费问题
  //但是会出现新的问题：线程安全问题
  private LazySingleton() {
  }

  private static LazySingleton lazySingleton = null;

  public static LazySingleton getInstance() {
    if (lazySingleton == null) {
      return new LazySingleton();
    }
    return lazySingleton;
  }
}
