package com.scooterapp;

public class Main {
        public static void main(String[] args) {
            try {
                // Creating an instance of ScooterApp
                ScooterApp app = new ScooterApp();
    
                // Registering users
                app.registerUser("claire_robson", "password123", 26);
                app.registerUser("bobby_robson", "password456", 23);
    
                // Log in a user
                app.loginUser("claire_robson", "password123");
    
                // Create scooters at stations
                Scooter scooter1 = app.createScooter("Central Station");
                Scooter scooter2 = app.createScooter("Argyle Street");
    
                // Rent a scooter
                app.rentScooter(scooter1, "claire_robson" );
    
                // Dock a scooter
                app.dockScooter(scooter1, "Queen Street");
                
                // Print current status
                app.print();
    
                // Log out user
                app.logoutUser("claire_robson");
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

