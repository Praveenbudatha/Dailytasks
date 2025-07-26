package opps;

public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using overloaded methods:
        int sumInt = calc.add(5, 10);
        double sumDouble = calc.add(2.5, 3.7);
        String concat = calc.add("Hello", "World");

        System.out.println("Sum of ints: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
        System.out.println("Concatenation of strings: " + concat);
    }
}
