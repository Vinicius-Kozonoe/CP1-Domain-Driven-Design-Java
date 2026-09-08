// 1- Escreva um programa que leia um número em metros e converta para centímetros e milímetros

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Centímetros: " + centimetros);
        System.out.println("Milímetros: " + milimetros);

        sc.close();
    }
}