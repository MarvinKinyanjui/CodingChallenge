public class TemperatureConverter {
    public void convertToCelsius(int fahrenheit) {
        double temperature = ((fahrenheit - 32) * 5.0 / 9);
        System.out.println("The temperature is " + temperature + " degrees Celsius.");
    }

    public void convertToFahrenheit(double celsius) {
        double temperature = (celsius * 9.0 / 5) + 32;
        System.out.println("The temperature is " + temperature + " degrees Fahrenheit.");
    }
}
