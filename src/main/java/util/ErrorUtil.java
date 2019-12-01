package util;

public class ErrorUtil {
    public static double mseError(double expectedResult, double actualResult, int numOfSets){
        double numerator = Math.pow((expectedResult - actualResult),2);
        return numerator/numOfSets;
    }

    public static double rootMSEError(double expectedResult, double actualResult, int numOfSets){
        double numerator = Math.pow((expectedResult - actualResult),2);
        return Math.sqrt(numerator/numOfSets);
    }
}
