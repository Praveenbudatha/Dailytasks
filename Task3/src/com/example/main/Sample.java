package com.example.main;
import com.example.util.Util;
import static com.example.util.Util.APP_NAME;
import static com.example.util.Util.printGreeting;
public class Sample {
    public static void main(String[] args) {
 
        System.out.println("App via class: " + Util.APP_NAME);
        Util.printGreeting("Praveen");
        System.out.println("App via static import: " + APP_NAME);
        printGreeting("Ram");
    }
}

