package main.java.you.hungry;

//静态块写法实现饿汉单例
public class HungryStaticSingleton {

  private HungryStaticSingleton() {
  }

  private static final HungryStaticSingleton hungrySingleton;

  //静态块
  static {
    hungrySingleton = new HungryStaticSingleton();
  }

  public HungryStaticSingleton getInstance() {
    return hungrySingleton;
  }

}
