import java.util.Scanner;
public class Exercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        String nomeMulherMaisJovem = "";
        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        int somaIdades = 0;
        int totalPessoas = 0;
        int totalHomensMais30 = 0;
        int totalMulheresMenos18 = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            String sexo = scanner.next();

            // Somatório de idades para calcular a média
            somaIdades += idade;
            totalPessoas++;

            // Verifica a pessoa mais velha
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            // Verifica a mulher mais jovem
            if (sexo.equalsIgnoreCase("F") && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade;
                nomeMulherMaisJovem = nome;
            }

            // Verifica quantos homens tem mais de 30 anos
            if (sexo.equalsIgnoreCase("M") && idade > 30) {
                totalHomensMais30++;
            }

            // Verifica quantas mulheres tem menos de 18 anos
            if (sexo.equalsIgnoreCase("F") && idade < 18) {
                totalMulheresMenos18++;
            }

            // Pergunta se deseja continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        }

        // Exibe os resultados
        System.out.println("\nNome da pessoa mais velha: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais jovem: " + (nomeMulherMaisJovem.isEmpty() ? "Nenhuma mulher cadastrada" : nomeMulherMaisJovem));
        System.out.println("Média de idade do grupo: " + (totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0));
        System.out.println("Total de homens com mais de 30 anos: " + totalHomensMais30);
        System.out.println("Total de mulheres com menos de 18 anos: " + totalMulheresMenos18);

        scanner.close();
    }
}
