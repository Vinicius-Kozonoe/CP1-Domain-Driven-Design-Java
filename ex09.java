//9- Crie uma função que receba três números e retorne a média aritmética.

import java.util.Scanner;

public class ex09 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = sc.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;
        System.out.printf("A média aritmética dos 3 valores é de: %.1f%n", media);
    }
}
