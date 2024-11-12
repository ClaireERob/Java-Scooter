package com.scooterapp;
import java.util.*;

public class ScooterApp {
    private Map<String, List<Scooter>> stations = new HashMap<>();
    private Map<String, User> registeredUsers = new HashMap<>();

    public ScooterApp() {
        

      // Setting up some stations 
        stations.put("Central Station", new ArrayList<>());
        stations.put("Argyle Street", new ArrayList<>());
        stations.put("Queen Street", new ArrayList<>());
    }


    // This public method is required to be able to return registeredUsers in main since the field is private. 
    public Map<String, User> getRegisteredUsers() {
      return registeredUsers;
  }

    // Registering a new user 
    public void registerUser(String username, String password, int age) throws Exception {
        if (registeredUsers.containsKey(username)) {
            throw new Exception("User already registered.");
        }
        if (age < 18) {
            throw new Exception("User must be 18 or older.");
        }
        User user = new User(username, password, age);
        registeredUsers.put(username, user);
        System.out.println("User " + username + " has been registered.");
    }


    // Logging in a user
    public void loginUser(String username, String password) throws Exception {
        User user = registeredUsers.get(username);
        if (user == null) {
            throw new Exception("Username or password is incorrect.");
        }
        user.login(password);
    }


    // Logging a user out
    public void logoutUser(String username) throws Exception {
        User user = registeredUsers.get(username);
        if (user == null || !user.isLoggedIn()) {
            throw new Exception("No such user is logged in.");
        }
        user.logout();
    }


    // Creating a scooter
    public Scooter createScooter(String station) throws Exception {
        if (!stations.containsKey(station)) {
            throw new Exception("No such station.");
        }
        Scooter scooter = new Scooter(station);
        stations.get(station).add(scooter);
        System.out.println("New scooter created at " + station);
        return scooter;
    }



    //Docking a scooter 
    public void dockScooter(Scooter scooter, String station) throws Exception {
        if (!stations.containsKey(station)) {
            throw new Exception("No such station.");
        }
        if (scooter.getStation() != null) {
            throw new Exception("Scooter already at station.");
        }
        scooter.dock(station);
        stations.get(station).add(scooter);
    }



    //Renting a scooter
    public void rentScooter(Scooter scooter, String username) throws Exception {
        if (!stations.containsKey(scooter.getStation())) {
            throw new Exception("No such station.");
        }
        scooter.rent(username);
    }

    // Printing lists of registered users and also stations
    public void print() {
        System.out.println("Registered Users:");
        for (User user : registeredUsers.values()) {
            System.out.println(user.getUsername());
        }
        
        System.out.println("Scooter Stations:");
        for (String station : stations.keySet()) {
            System.out.println(station + ": " + stations.get(station).size() + " scooters");
        }
    }
}