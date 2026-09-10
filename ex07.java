//7- Crie uma função que receba dois números e retorne o maior deles.

import java.util.Scanner;

public class ex07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = sc.nextFloat();

        if (n1 < n2) {
            System.out.println("O maior número entre os escolhidos é: " + n2);
        }
        else if (n1 > n2) {
            System.out.println("O maior número entre os escolhidos é: " + n1);
        }
        else {
            System.out.println("Os números são iguais!");
        }
        sc.close();
    }
}
