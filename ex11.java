import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("--- Pessoa " + (i + 1) + " ---");

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(scanner.nextLine());
        }

        int indiceMaisVelho = 0;
        for (int i = 1; i < 3; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
        }

        System.out.println("\nA pessoa mais velha é: " + nomes[indiceMaisVelho]
                + " (" + idades[indiceMaisVelho] + " anos)");

        scanner.close();
    }
}