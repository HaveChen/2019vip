package main.java.you.simple;

import java.util.List;

/*
 *chenyou
 *2019/11/5  15:43
 */
public class User implements Prototype {

  private String name;
  private String address;
  private List hobbies;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List getHobbies() {
    return hobbies;
  }

  public void setHobbies(List hobbies) {
    this.hobbies = hobbies;
  }

  @Override
  public Prototype clone() {
    User user = new User();
    user.setAddress(this.address);
    user.setHobbies(this.hobbies);
    user.setName(this.name);
    return user;
  }

  public static void main(String[] args) {
    System.out.println(111);
  }
}
