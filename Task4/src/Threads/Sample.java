package Threads;
class RunnableCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                System.out.println("Counter interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class Sample {
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter();
        Thread thread = new Thread(counter);
        thread.start();
    }
}