package Abstarct;

//Printable.java
interface Printable {
 void print(); // abstract method
}

 interface Scannable {
 void scan(); // abstract method
}

 class MultifunctionPrinter implements Printable, Scannable {
 private String model;

 public MultifunctionPrinter(String model) {
     this.model = model;
 }

 @Override
 public void print() {
     System.out.println(model + ": Printing document...");
 }

 @Override
 public void scan() {
     System.out.println(model + ": Scanning document...");
 }
}

public class Sample2 {
 public static void main(String[] args) {
     MultifunctionPrinter mfp = new MultifunctionPrinter("2000");

     
     mfp.print();   

     
     mfp.scan();    
 }
}
