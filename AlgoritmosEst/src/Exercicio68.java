import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        int quantidadePares = 0;
        int count = 0;

        String continuar = "s";

        // Estrutura "faça enquanto"
        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;
            count++;

            // Verifica o menor valor
            if (numero < menorValor) {
                menorValor = numero;
            }

            // Verifica se o número é par
            if (numero % 2 == 0) {
                quantidadePares++;
            }

            // Pergunta se o usuário quer continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Exibe os resultados
        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("\nSomatório dos valores: " + soma);
            System.out.println("Menor valor digitado: " + menorValor);
            System.out.println("Média dos valores: " + media);
            System.out.println("Quantidade de números pares: " + quantidadePares);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
