import java.util.Scanner;
public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int totalHomens = 0;
        int somaIdadeHomens = 0;
        int totalPessoas = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o sexo da pessoa (M/F): ");
            String sexo = scanner.next();

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            // Verifica a maior idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            // Se for homem, soma a idade para calcular a média
            if (sexo.equalsIgnoreCase("M")) {
                totalHomens++;
                somaIdadeHomens += idade;
            }

            // Se for mulher, verifica a menor idade
            if (sexo.equalsIgnoreCase("F") && idade < menorIdadeMulher) {
                menorIdadeMulher = idade;
            }

            // Pergunta se deseja continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
            totalPessoas++;
        }

        // Exibe os resultados
        if (totalHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadeHomens / totalHomens;
            System.out.println("\nMaior idade lida: " + maiorIdade);
            System.out.println("Total de homens cadastrados: " + totalHomens);
            System.out.println("Idade da mulher mais jovem: " + (menorIdadeMulher == Integer.MAX_VALUE ? "Nenhuma mulher cadastrada" : menorIdadeMulher));
            System.out.println("Média de idade entre os homens: " + mediaIdadeHomens);
        } else {
            System.out.println("\nNenhum homem foi cadastrado.");
        }

        scanner.close();
    }
}
