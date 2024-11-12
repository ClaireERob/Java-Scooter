public class Main {
        public static void main(String[] args) {
            try {
                // Creating an instance of ScooterApp
                ScooterApp app = new ScooterApp();
    
                // Registering users
                app.registerUser("claire_robson", "password123", 26);
                app.registerUser("bobby_robson", "password456", 2);
    
                // Log in a user
                app.loginUser("claire_robson", "password123");
    
                // Create scooters at stations
                Scooter scooter1 = app.createScooter("Rutherglen");
                Scooter scooter2 = app.createScooter("Bridgeton");
    
                // Rent a scooter
                User claire = app.getRegisteredUsers().get("claire_robson");
                if (claire != null) {
                    app.rentScooter(scooter1, claire);
                } else {
                    System.out.println("User claire_robson not found.");
                }
    
                // Print current status
                app.print();
    
                // Log out user
                app.logoutUser("claire_robson");
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

