package com.tech;

import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature value: ");
    double value = scanner.nextDouble();

    System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
    String unit = scanner.next().toUpperCase();

    switch (unit) {
        case "C":
            double fahrenheitFromCelsius = (value * 9/5) + 32;
            double kelvinFromCelsius = value + 273.15;
            System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", value, fahrenheitFromCelsius, kelvinFromCelsius);
            break;

        case "F":
            double celsiusFromFahrenheit = (value - 32) * 5/9;
            double kelvinFromFahrenheit = (value - 32) * 5/9 + 273.15;
            System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", value, celsiusFromFahrenheit, kelvinFromFahrenheit);
            break;

        case "K":
            double celsiusFromKelvin = value - 273.15;
            double fahrenheitFromKelvin = (value - 273.15) * 9/5 + 32;
            System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", value, celsiusFromKelvin, fahrenheitFromKelvin);
            break;

        default:
            System.out.println("Invalid unit of measurement. Please use 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
            break;
    }

	}

}
