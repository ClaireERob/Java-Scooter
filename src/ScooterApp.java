public class ScooterApp {
  public static void main(String[] args) {
    try {
    // Creating new instances of a User and a Scooter
    User user = new User("Claire", "password123", 26);
    Scooter scooter = new Scooter("Glasgow Central");

    // Logging the user in
    user.login("password123");

    // Renting the scooter
    scooter.rent("Claire");

    // Docking the scooter back to a station
    scooter.dock("Glasgow Central");

    // Log the user out
    user.logout();

  } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
  }


  


