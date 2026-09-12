//14- Escreva uma função que receba a temperatura em Fahrenheit e retorne em Celsius.

import java.util.Scanner;

public class ex14 {
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = fahrenheitParaCelsius(fahrenheit);

        System.out.printf("%.1f °F equivale a %.1f °C%n", fahrenheit, celsius);

        sc.close();
    }
}