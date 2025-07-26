package opps;

//Appliance.java
abstract class Appliance {
 public void turnOn() {
     System.out.println("Appliance is turned ON.");
 }
}
//Connectable.java
interface Connectable {
 void connect();
}
//SmartTV.java
class SmartTv extends Appliance implements Connectable {
 private String model;

 public SmartTv(String model) {
     this.model = model;
 }


 public void connect() {
     System.out.printf("SmartTV (%s) is now connected to the network.%n", model);
 }

 // Optionally override turnOn to provide more details
 
 public void turnOn() {
     System.out.printf("SmartTV (%s) powering up.%n", model);
 }

 public void showModel() {
     System.out.println("Model: " + model);
 }

 public static void main(String[] args) {
     SmartTv tv = new SmartTv("SuperVision X1");

     tv.turnOn();     // inherited (or overridden) behavior
     tv.connect();    // interface-implemented behavior
     tv.showModel();  // additional method
 }
}

