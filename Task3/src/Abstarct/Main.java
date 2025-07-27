package Abstarct;

//Shape.java
abstract class Shape {
 // Abstract method to compute area
 public abstract double area();
}
//Circle.java
 class Circle extends Shape {
 private double radius;

 // Constructor to initialize radius
 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}
//Rectangle.java
 class Rectangle extends Shape {
 private double width;
 private double height;

 // Constructor to initialize width and height
 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double area() {
     return width * height;
 }
}
//Main.java
public class Main {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);

     System.out.println("Circle area: " + circle.area());
     System.out.println("Rectangle area: " + rectangle.area());
 }
}
