package Abstarct1;


//Shape.java
abstract class Shape {
private String shapeType;

// Constructor to initialize shapeType
public Shape(String shapeType) {
   this.shapeType = shapeType;
}

public void displayShapeType() {
   System.out.println("Shape type: " + shapeType);
}

public abstract double area();
}
//Circle.java
class Circle extends Shape {
private double radius;

public Circle(double radius) {
   super("Circle");
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
   super("Rectangle");
   this.width = width;
   this.height = height;
}

@Override
public double area() {
   return width * height;
}
}
//Main.java
public class Main1 {
public static void main(String[] args) {
   Shape c = new Circle(5.0);
   Shape r = new Rectangle(4.0, 6.0);

   c.displayShapeType();           
   System.out.println("Area: " + c.area());  

   r.displayShapeType();           
   System.out.println("Area: " + r.area()); 
}
}