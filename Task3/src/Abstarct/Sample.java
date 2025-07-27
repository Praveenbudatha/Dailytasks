package Abstarct;
 interface RemoteControl {
    
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery level is sufficient.");
    }
}
 class TV implements RemoteControl {
    private boolean poweredOn = false;

    @Override
    public void turnOn() {
        if (!poweredOn) {
            poweredOn = true;
            System.out.println("TV is now ON.");
        } else {
            System.out.println("TV is already ON.");
        }
    }

    // Optionally override the default method
    @Override
    public void batteryStatus() {
        System.out.println("TV remote battery at 80%.");
    }
}
public class Sample {
    public static void main(String[] args) {
        RemoteControl myRemote = new TV();

       
        myRemote.turnOn();           
        myRemote.turnOn();             

        
        myRemote.batteryStatus();      
    }
}
