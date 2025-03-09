import java.util.Scanner;
public class Exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro termo e a razão da PA
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        // Variáveis para armazenar a soma e o valor atual da PA
        int soma = 0;
        int termo = primeiroTermo;

        // Exibe os 10 primeiros termos da PA e soma os valores
        System.out.println("Os 10 primeiros termos da PA são:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(termo + " ");
            soma += termo;
            termo += razao; // Calcula o próximo termo
        }

        // Exibe a soma de todos os termos
        System.out.println("\nSoma de todos os termos da PA: " + soma);

        scanner.close();
    }
}
