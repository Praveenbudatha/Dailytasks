package opps;

public class Employee {
    // Static variable shared by all Employee instances
    private static int count = 0;

    // Instance fields
    private String name;
    private int id;

    // Constructor increments the shared counter on each instantiation
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    // Static method to access current count
    public static int getCount() {
        return count;
    }

    // Instance method to display employee info
    public void displayDetails() {
        System.out.printf("Employee ID: %d, Name: %s%n", id, name);
    }

    public static void main(String[] args) {
        // Create two employee instances
        Employee e1 = new Employee(1, "Alice");
        Employee e2 = new Employee(2, "Bob");

        // Display their individual details
        System.out.println("Employee Details:");
        e1.displayDetails();
        e2.displayDetails();

        // Print the total number of employees created so far
        System.out.println("\nTotal number of employees created: " + Employee.getCount());
    }
}

