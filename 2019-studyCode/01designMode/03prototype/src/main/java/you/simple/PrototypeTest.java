package you.simple;

import java.util.ArrayList;
import java.util.List;

/*
 *chenyou
 *2019/11/5  15:44
 */
public class PrototypeTest {

  public static void main(String[] args) {
    main.java.you.simple.User user = new main.java.you.simple.User();
    user.setName("Chenyou");
    user.setAddress("shenzhen");
    List hobbies = new ArrayList<String>();
    hobbies.add("test");
    user.setHobbies(hobbies);
    main.java.you.simple.User userClone = (main.java.you.simple.User) user.clone();
    List h = userClone.getHobbies();
    h.add("test2");
    userClone.setHobbies(h);
    //浅克隆模式，只是克隆引用而已
    System.out.println(user.getHobbies().size());//size是2
    System.out.println(userClone.getHobbies().size());//size也是2
    //因为user.clone()是浅克隆，有引用对象的时候只是克隆的引用，指向同一个对象，当对象被修改时，引用是没有
    //变化的，所以只要是引用指向这个被修改的对象，其他人修改的也会看上去生效。
    //为了解决这一个问题，所以还提供了一直深克隆模式。
  }
}
