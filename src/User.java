public class User {
  private String username; 
  private String password; 
  private int age; 
  public boolean loggedIn;

  public User(String username, String password, int age) {
    this.username = username;
    this.password = password;
    this.age = age; 
    this.loggedIn = false;
  }


  public boolean isLoggedIn() {
    return loggedIn;
  }
  
  public String getUsername() {
    return username;
  }
  
  
  public int getAge() {
    return age;
  }

// Logging in method
public void login(String password)throws Exception{
  if (!this.password.equals(password)) {
    throw new Exception("Incorrect password.");
}
this.loggedIn = true;
System.out.println(username + " has logged in.");
}


// Logging out method 
public void logout() {
  this.loggedIn = false; 
  System.out.println(username + " has logged out.");
}



}


