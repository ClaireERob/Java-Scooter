 // Setting up the class and it's properties

public class Scooter {
    
    public String station;
    public String user;
    public int serial;
    public int nextSerial;
    public int charge;
    public boolean isBroken; 

// Constructor to initialize the scooter 

public Scooter(String station) {
  this.station = station; 
  this.user = null;
  this.serial = nextSerial++;
  this.charge = 100; 
  this.isBroken = false; 
}



// Method to rent a scooter 

public void rent (String user) throws Exception {
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







  
  
  


