package homework_nr_4;

public class TemperatureConverter {

    // Metoda toCelsius
    public double toCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    // Metoda toFahrenheit
    public double toFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Apelarea metodei toCelsius() cu o valoare în Fahrenheit
        double fahrenheitValue = 451.0;
        double celsiusResult = temperatureConverter.toCelsius(fahrenheitValue);
        System.out.println(fahrenheitValue + " Fahrenheit = " + celsiusResult + " Celsius");

        // Apelarea metodei toFahrenheit() cu o valoare în Celsius
        double celsiusValue = 20.0;
        double fahrenheitResult = temperatureConverter.toFahrenheit(celsiusValue);
        System.out.println(celsiusValue + " Celsius = " + fahrenheitResult + " Fahrenheit");
    }
}
