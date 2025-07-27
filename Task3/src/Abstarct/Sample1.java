package Abstarct;
interface RemoteControls {
    
    void turnOn();

   
    default void batteryStatus() {
        System.out.println("Battery level is sufficient.");
    }

   
    static void info() {
        System.out.println("RemoteControl interface for generic devices.");
    }
}
 class Tvs implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

   
    @Override
    public void batteryStatus() {
        System.out.println("TV remote battery at 80%.");
    }
}
public class Sample1 {
    public static void main(String[] args) {
       
        RemoteControls.info();  

       
        RemoteControl rc = new Tvs();

        rc.turnOn();          
        rc.batteryStatus();    
    }
}
