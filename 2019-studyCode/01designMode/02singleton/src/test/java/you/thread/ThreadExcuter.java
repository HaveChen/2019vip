package test.java.you.thread;

import main.java.you.lazy.LazySingleton;

/*
 *chenyou
 *2019/11/7  9:40
 */
public class ThreadExcuter implements Runnable {

  @Override
  public void run() {
    LazySingleton lazy = LazySingleton.getInstance();
    System.out.println(Thread.currentThread().getName() + "---" + lazy);
  }
}
