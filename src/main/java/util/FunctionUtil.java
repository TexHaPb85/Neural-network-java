package util;

public class FunctionUtil {
    public static double sigmoidFunc(double input){
        double denominator = (1+Math.pow(Math.E,input*(-1)));
        return 1/denominator;
    }

    public static double linearFunc(double input){
        return input;
    }

    public static double hyperbolicTgFunc(double input){
        double numerator = Math.pow(Math.E,input*2)-1;
        double denominator = Math.pow(Math.E,input*2)+1;
        return numerator/denominator;
    }
}
