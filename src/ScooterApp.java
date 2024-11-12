import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 


public class ScooterApp {
  
  private List<User> registeredUsers;

  private Map<String, Integer> stations;

  public ScooterApp() {
    this.registeredUsers = new ArrayList<>();
    this.stations = new HashMap<>();
  }
   
public void registerUser(String username, String password, int age) throws Exception {

  for (User user : registeredUsers) {
    if (user.username.equals(username)) {
      throw new Exception("Already registered")
    }
  }

  if(age<18) {
    throw new Exception("Too young to register")
  }

  User newUser = new User(username, password, age);
  registeredUsers.add(newUser);
}


  }
  