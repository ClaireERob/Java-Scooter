package com.scooterapp;
 // Setting up the class and it's properties

public class Scooter {
    
    private String station;
    private String username;
    private final int serial;
    private int nextSerial;
    private int charge;
    private boolean isBroken; 

// Constructor to initialize the scooter 

public Scooter(String station) {
  this.station = station; 
  this.username = null; 
  this.serial = nextSerial++;
  this.charge = 100; 
  this.isBroken = false; 
}

// Getters since fields are private 
public String getStation() {
  return station;
}

public String getUsername() {
  return username;
}


// Method to rent a scooter 

public void rent (String username) throws Exception {
  if (this.charge <= 20) {
    throw new Exception("Scooter needs to charge");
  } else if (this.isBroken) {
    throw new Exception("Scooter needs repair");
  }

this.station = null;
this.username = username;

System.out.println("Scooter successfully rented by " + this.username + ".");

}



// Method to dock a scooter 
public void dock(String station) {
  this.station = station;
  this.username = null; 
  System.out.println("Scooter successfully docked at " + this.station + ".");
}




}







  
  
  


