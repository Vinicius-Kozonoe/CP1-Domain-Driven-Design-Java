import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura da caixa (m): ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Comprimento da caixa (m): ");
        double comprimento = Double.parseDouble(scanner.nextLine());

        System.out.print("Largura da caixa (m): ");
        double largura = Double.parseDouble(scanner.nextLine());

        double volume = altura * comprimento * largura;

        System.out.printf("\nO volume da caixa é: %.2f m³%n", volume);

        scanner.close();
    }
}