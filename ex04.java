//4-Crie uma função que receba um número inteiro e retorne seu fatorial. Teste no main. 

import java.util.Scanner;

public class ex04 {
    public static int fatorial (int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);

        sc.close();
    }
}