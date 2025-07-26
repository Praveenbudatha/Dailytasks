package opps;

//Shape.java
abstract class Shape {
 public abstract double area();
}
//Circle.java
class Circle extends Shape {
 private double radius;
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
     Shape circle = new Circle(3.0);
     Shape rectangle = new Rectangle(5.0, 4.0);

     System.out.printf("Area of circle (r=3.0): %.2f%n", circle.area());
     System.out.printf("Area of rectangle (5×4): %.2f%n", rectangle.area());
 }
}
