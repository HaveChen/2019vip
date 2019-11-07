package test.java.you.lazy;

import test.java.you.thread.ThreadExcuter;

/*
 *chenyou
 *2019/11/7  9:55
 */
public class LazySingletonTest {

  public static void main(String[] args) {
    Thread t1 = new Thread(new ThreadExcuter());
    Thread t2 = new Thread(new ThreadExcuter());
    t1.start();
    t2.start();
    System.out.println("End");

  }
}
