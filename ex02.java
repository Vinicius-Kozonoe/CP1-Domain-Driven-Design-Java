//2-Crie um programa que leia a idade de uma pessoa e diga se ela pode votar (idade ≥ 16). 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("A pessoa pode votar.");
        } else {
            System.out.println("A pessoa não pode votar.");
        }

        sc.close();
    }
}