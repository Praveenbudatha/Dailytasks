package Threads;
 class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Printer thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        NumberPrinter t = new NumberPrinter();
        t.start();  
        try {
            t.join();  
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting: " + e.getMessage());
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread done.");
    }
}
