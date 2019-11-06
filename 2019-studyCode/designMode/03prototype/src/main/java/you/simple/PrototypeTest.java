package java.you.simple;

import java.util.ArrayList;
import java.util.List;

/*
 *chenyou
 *2019/11/5  15:44
 */
public class PrototypeTest {

  public static void main(String[] args) {
    User user = new User();
    user.setName("Chenyou");
    user.setAddress("shenzhen");
    List hobbies = new ArrayList<String>();
    user.setHobbies(hobbies);
    User userClone = (User) user.clone();
    //浅克隆模式，只是克隆地址而已
    System.out.println("克隆后对比" + user.getAddress() == userClone.getAddress());

  }

}
