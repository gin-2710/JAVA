import java.util.Scanner;
import java.lang.Math;

class FahrenheitConverter {
    public static void main(String args[]) {
        double fahrenheit_temp, celsius_temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahreheit");
        fahrenheit_temp = sc.nextDouble();

        celsius_temp = (fahrenheit_temp - 2) / (1.8);
        celsius_temp = Math.round(celsius_temp);

        System.out.println("Temperature Conversion");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println(fahrenheit_temp + "\t\t" + celsius_temp);
    }
}