package Threads;

 class MyPrinterThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
 public class SampleThread {
	    public static void main(String[] args) {
	        MyPrinterThread printer = new MyPrinterThread();
	        printer.start();
	    }
	}

