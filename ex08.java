//8- Escreva um programa que leia a altura e o peso de uma pessoa e calcule seu IMC. Mostre também a classificação conforme a tabela:
// Abaixo de 18,4 -> Abaixo do peso
// 18,5 até 24,9 -> Peso normal
// 25 até 29,9 -> Sobrepeso
// 30 ou mais -> Obesidade

import java.util.Scanner;

public class ex08 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.print("Digite seu peso em quilogramas (kg): ");
        float peso = sc.nextFloat();

        float IMC = peso / (altura * altura);
        // printf permite a gente formatar o texto
        System.out.printf("Seu IMC é de: %.1f%n", IMC);

        if (IMC < 18.4) {
            System.out.println("Você está abaixo do peso.");
        }
        else if (IMC >= 18.5 & IMC < 24.9) {
            System.out.println("Você está no peso normal.");
        }
        else if (IMC >= 25 & IMC < 29.9 ) {
            System.out.println("Você está com sobrepeso.");
        }
        else {
            System.out.println("Você está com obesidade.");
        }
        sc.close();
    }
}
