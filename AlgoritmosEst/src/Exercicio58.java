import java.util.Scanner;
public class Exercicio58 {
    public static void main(String[] args) {
        // Criação do scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int homens = 0, mulheres = 0, mulheresMaisDe20 = 0;
        int somaIdades = 0, somaIdadesHomens = 0;
        int totalPessoas = 5;

        // Laço para ler as informações de 5 pessoas
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            // Atualiza contagens e somas conforme o sexo e a idade
            if (sexo == 'M' || sexo == 'm') {
                homens++;
                somaIdadesHomens += idade;
            } else if (sexo == 'F' || sexo == 'f') {
                mulheres++;
                if (idade > 20) {
                    mulheresMaisDe20++;
                }
            }

            // Soma as idades para calcular a média geral
            somaIdades += idade;
        }

        // Calcula as médias
        double mediaIdade = somaIdades / (double) totalPessoas;
        double mediaIdadeHomens = homens > 0 ? somaIdadesHomens / (double) homens : 0;

        // Exibe os resultados
        System.out.println("\nRelatório:");
        System.out.println("Homens cadastrados: " + homens);
        System.out.println("Mulheres cadastradas: " + mulheres);
        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Mulheres com mais de 20 anos: " + mulheresMaisDe20);

        // Fecha o scanner
        scanner.close();
    }
}
