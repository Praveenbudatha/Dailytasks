package opps;

class Vehicle {
	 protected String brand;
	 protected int speed;

	 public Vehicle(String brand, int speed) {
	     this.brand = brand;
	     this.speed = speed;
	 }

	 public void showDetails() {
	     System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
	 }
	}
	//Car.java
	class Car extends Vehicle {
	 private int numberOfDoors;

	 public Car(String brand, int speed, int numberOfDoors) {
	     super(brand, speed);
	     this.numberOfDoors = numberOfDoors;
	 }

	 @Override
	 public void showDetails() {
	     System.out.printf("Car -> Brand: %s, Speed: %d km/h, Doors: %d%n",
	             brand, speed, numberOfDoors);
	 }
	}
	//Bike.java
	class Bike extends Vehicle {
	 private boolean hasCarrier;

	 public Bike(String brand, int speed, boolean hasCarrier) {
	     super(brand, speed);
	     this.hasCarrier = hasCarrier;
	 }

	 @Override
	 public void showDetails() {
	     System.out.printf("Bike -> Brand: %s, Speed: %d km/h, Carrier: %s%n",
	             brand, speed, hasCarrier ? "Yes" : "No");
	 }
	}
	//Main.java
	 class Praveen {
	 public static void main(String[] args) {
	     Vehicle myCar = new Car("Toyota", 180, 4);
	     Vehicle myBike = new Bike("Yamaha", 120, true);

	     System.out.println("Vehicle details:");
	     myCar.showDetails();
	     myBike.showDetails();
	 }
	}
