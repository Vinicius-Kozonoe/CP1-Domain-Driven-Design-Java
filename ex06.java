//6- Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.

import java.util.Scanner;

public class ex06 {
    public static void main (String[] args) {
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(i + " * " + numero + " = " + resultado);
        }
    }
}
