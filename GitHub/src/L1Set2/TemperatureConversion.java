package L1Set2;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f\n%.2f\n", fahrenheit, kelvin);

      
        scanner.close();
    }
}

