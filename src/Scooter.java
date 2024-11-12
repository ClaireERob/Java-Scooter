 // Setting up the class and it's properties

public class Scooter {
    
    private String station;
    private User user;
    private final int serial;
    private int nextSerial;
    private int charge;
    private boolean isBroken; 

// Constructor to initialize the scooter 

public Scooter(String station) {
  this.station = station; 
  this.user = null;
  this.serial = nextSerial++;
  this.charge = 100; 
  this.isBroken = false; 
}

// Getters since fields are private 
public String getStation() {
  return station;
}

public User getUser() {
  return user;
}


// Method to rent a scooter 

public void rent (User user) throws Exception {
  if (this.charge <= 20) {
    throw new Exception("Scooter needs to charge");
  } else if (this.isBroken) {
    throw new Exception("Scooter needs repair");
  }

this.station = null;
this.user = user;

System.out.println("Scooter successfully rented by " + this.user + ".");

}



// Method to dock a scooter 
public void dock(String station) {
  this.station = station;
  this.user = null; 
  System.out.println("Scooter successfully docked at " + this.station + ".");
}




}







  
  
  


