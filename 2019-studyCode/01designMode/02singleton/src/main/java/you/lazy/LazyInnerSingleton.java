package main.java.you.lazy;

public class LazyInnerSingleton {

  private LazyInnerSingleton() {
  }

  //每一个关键字都不是多余的
  //static 是为了使单例的空间共享
  //保证这个方法不会被重写，重载
  public static LazyInnerSingleton getInstance() {
    return LazyMake.lazy;
  }

  //巧妙的利用的静态内部类的加载机制，可以完美的实现线程安全的
  //默认不加载。只有调用的时候才会去加载，实现懒加载
  private static class LazyMake {

    private static final LazyInnerSingleton lazy = new LazyInnerSingleton();

  }
}
