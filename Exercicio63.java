import java.util.Scanner;
public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 0;
        int somaIdades = 0;
        int idade = 0;

        // Laço que continua até a idade 999 ser digitada
        while (idade != 999) {
            System.out.print("Digite a idade do aluno (ou 999 para terminar): ");
            idade = scanner.nextInt();

            // Verifica se a idade é diferente de 999
            if (idade != 999) {
                totalAlunos++;
                somaIdades += idade;
            }
        }

        // Exibe o resultado
        if (totalAlunos > 0) {
            double mediaIdade = (double) somaIdades / totalAlunos;
            System.out.println("\nTotal de alunos na turma: " + totalAlunos);
            System.out.println("Média de idade dos alunos: " + mediaIdade);
        } else {
            System.out.println("Nenhuma idade foi registrada.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
