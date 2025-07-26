package opps;

//Logger.java
interface Logger {
 // Default method
 default void logInfo(String message) {
     System.out.println("INFO: " + message);
 }


 static void logError(String message) {
     System.err.println("ERROR: " + message);
 }
}
//AppLogger.java
public class AppLogger implements Logger {


 public static void main(String[] args) {
     AppLogger logger = new AppLogger();

     logger.logInfo("Application started");

     Logger.logError("Unable to connect to database");
 }
}

