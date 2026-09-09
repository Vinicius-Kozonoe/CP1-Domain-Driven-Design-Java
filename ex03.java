//3-Escreva um programa que leia dois números e mostre todos os números inteiros entre eles. 

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            for (int i = n1 + 1; i < n2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n2 + 1; i < n1; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}