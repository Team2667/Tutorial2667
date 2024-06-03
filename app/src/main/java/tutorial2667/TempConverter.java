package tutorial2667;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class TempConverter{

    public static void main(String args[]) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter a temperature ");
            double temp = getTemeratureFromInput(reader);
            System.out.println("Enter C for Celsius, F for Fahrenheit");
            String scale = getTemperatureScale(reader);
            if (scale.equals("F")) {
                System.out.println("Tempture in Celsius is " + fahrenheitToCelsius(temp));
            } else {
                System.out.println("Tempurature in Fahrenheit is " + celsiusToFahrenheit(temp)); 
            }
        }
    }

    public static double fahrenheitToCelsius(double fTemp) {
        // TODO: Implement this function.
        // You can use your favorite search to find the formula.
        return fTemp;
    }

    public static double celsiusToFahrenheit(double cTemp) {
        // TODO: Implement this function.
        // You can use your favorite search to find the formula.
        return cTemp;
    }

    public static double getTemeratureFromInput(BufferedReader reader) throws Exception{
        Optional<Double> optDouble = toDoubleOptional(reader.readLine());
        while (optDouble.isEmpty()) {
            System.out.println("Tempture must be in the form of a number");
            optDouble =  toDoubleOptional(reader.readLine());
        }
        return optDouble.get().doubleValue();
    }

    public static String getTemperatureScale(BufferedReader reader) throws Exception {
        String scale = reader.readLine();
        while (!scale.equals("F") && !scale.equals("C")) {
            System.out.println("Enter C for Celsius, F for Fahrenheit");
            scale = reader.readLine();
        }
        return scale;
    }

    public static Optional<Double> toDoubleOptional(String numberStr) {
        try {
            double d = Double.parseDouble(numberStr);
            return Optional.of(d);
        } catch (NumberFormatException nfe) {
            return Optional.empty();
        }
    }

}