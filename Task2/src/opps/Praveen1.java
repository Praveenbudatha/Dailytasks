package opps;

//Animal.java
class Animal {
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}
//Dog.java
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}
//Cat.java
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }
}
//Cow.java
class Cow extends Animal {
 @Override
 public void sound() {
     System.out.println("Cow moos");
 }
}
//Main.java
public class Praveen1 {
 public static void main(String[] args) {
     Animal[] animals = {
         new Dog(),
         new Cat(),
         new Cow()
     };

     System.out.println("Animal sounds:");
     for (Animal a : animals) {
         a.sound();  
     }
 }
}
