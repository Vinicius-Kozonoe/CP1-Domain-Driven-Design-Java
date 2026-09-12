//15- Crie um programa que leia um número inteiro e exiba uma contagem regressiva até 0.

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Fim da contagem!");

        sc.close();
    }
}