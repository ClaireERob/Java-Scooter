public class User {
  String username; 
  String password; 
  int age; 
  boolean loggedIn;

  public User(String username, String password, int age) {
    this.username = username;
    this.password = password;
    this.age = age; 
    this.loggedIn = false;
  }

public void login(String password)throws Exception{
  if (this.password.equals(password)) {
    this.loggedIn = true;
    System.out.println(this.username + " has logged in.");
  } else {
    throw new Exception("Incorrect password");
  }
}


public void logout() {
  this.loggedIn = false; 
  System.out.println(this.username + " has logged out.");
}

}


