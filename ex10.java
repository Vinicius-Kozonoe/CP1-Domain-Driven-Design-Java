//10- Escreva um programa que leia o preço de um produto e a forma de pagamento, mostrando o valor final a pagar, conforme a tabela:
// À vista (desconto de 10%)
// Parcelado em 2x (sem juros)
// Parcelado em 4x (juros de 8%)

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        float precoProduto = sc.nextFloat();


        System.out.println();
        System.out.println(" ==== FORMAS DE PAGAMENTO ACEITAS ==== ");
        System.out.println();
        System.out.println("1. À vista (desconto de 10%)");
        System.out.println("2. Parcelado em 2x (sem juros)");
        System.out.println("3. Parcelado em 4x (juros de 8%)");
        System.out.print("Digite o número correspondente a forma de pagamento desejada: ");

        int pagamento = sc.nextInt();
        switch (pagamento) {
            case 1:
                System.out.println();
                System.out.println("A FORMA DE PAGAMENTO ESCOLHIDA FOI: À VISTA");
                System.out.println("O valor final do produto ficou de R$" + (precoProduto - precoProduto / 10));
                break;
            case 2:
                System.out.println();
                System.out.println("A FORMA DE PAGAMENTO ESCOLHIDA FOI: PARCELADO EM 2X (sem juros)");
                System.out.println("O valor final do produto ficou de R$" + precoProduto);
                System.out.println("Que será efetuado em duas parcelas de R$" + (precoProduto / 2) + " cada");
                break;
            case 3:
                double precoJuros = precoProduto + precoProduto * 0.08;
                System.out.println();
                System.out.println("A FORMA DE PAGAMENTO ESCOLHIDA FOI: PARCELADO EM 4X (juros de 8%)");
                System.out.println("O valor final do produto ficou de R$" + precoJuros);
                System.out.println("Que será efetuado em quatro parcelas de R$" + (precoJuros / 4) + " cada");
                break;
            default:
                System.out.println();
                System.out.println("Forma de pagamento não existente.");
                break;
        }
    }
}
