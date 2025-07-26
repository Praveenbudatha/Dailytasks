package opps;

	//Fields: title, author, price 
	// Method: displayDetails() 
    // In main(), create 2 book objects and print their details.
	
		public class Task1 {
		    // Instance variables
		    private String title;
		    private String author;
		    private double price;

		    // Parameterized constructor
		    public Task1(String title, String author, double price) {
		        this.title  = title;
		        this.author = author;
		        this.price  = price;
		    }

		    // Method to display book details
		    public void displayDetails() {
		        System.out.println("Title : "  + title);
		        System.out.println("Author: "  + author);
		        System.out.printf("Price :" + price);
		    }

		    // Main method to test
		    public static void main(String[] args) {
		        Task1 b1 = new Task1("wipro", "ramu", 12.00);
		        Task1 b2 = new Task1("1984", "praveen", 8.50);

		        System.out.println("Book 1 Details:");
		        b1.displayDetails();

		        System.out.println("Book 2 Details:");
		        b2.displayDetails();
		    }
		}

