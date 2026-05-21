package ex_design_pattern;

public class User {
  public long uid;
  public String username;

  public User(long uid, String username) {
    this.uid = uid;
    this.username = username;
  }

  public void print(){
    System.out.println("uid = " + uid + ", username : " + username);
  }

  class UserFactory{
    public static User newInstance(long uid, String username){
      return new User(uid, username);
    }
  }
}
