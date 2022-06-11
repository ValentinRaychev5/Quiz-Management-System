package utils;

public class Utils {

    private Utils(){ // stops from creating objects in order to use the objects

    }
    public static void endProgram(String message){
        System.err.println(message);
        System.exit(-1);
    }
}
