package superset6419103.Algorithm_DataStructure.FinancialForecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double FutureValueRec(double presentValue, double growthRate, int years) {
        if (years == 0) {
         return presentValue; // Base case
        }
        return (1 + growthRate) * FutureValueRec(presentValue, growthRate, years - 1);
    }


    // Iterative method to calculate future value
    public static double FutureValueIter(double presentValue, double growthRate, int years) {
         for (int i = 0; i < years; i++) {
         presentValue *= (1 + growthRate);
        }
        return presentValue;
    }

    public static void main(String[] args) {
        double presentValue = 10000;  
        double growthRate = 0.08;     
        int years = 5;                

        // Recursive calculation
        double futureRec = FutureValueRec(presentValue, growthRate, years);
        System.out.printf("Recursive Forecast: Future value after %d years = ₹%.2f%n", years, futureRec);

        // Iterative calculation
        double futureIter = FutureValueIter(presentValue, growthRate, years);
        System.out.printf("Iterative Forecast: Future value after %d years = ₹%.2f%n", years, futureIter);
    }
}
