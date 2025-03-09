import java.util.Scanner;
public class Exercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 0;
        int somaIdades = 0;
        int pessoasMaior21 = 0;
        int count = 0;

        String continuar = "s";

        // Estrutura "faça enquanto"
        do {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            totalIdades++;
            count++;

            // Contagem de pessoas com 21 anos ou mais
            if (idade >= 21) {
                pessoasMaior21++;
            }

            // Pergunta se o usuário quer continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Exibe os resultados
        if (count > 0) {
            double mediaIdades = (double) somaIdades / totalIdades;
            System.out.println("\nTotal de idades digitadas: " + totalIdades);
            System.out.println("Média das idades: " + mediaIdades);
            System.out.println("Pessoas com 21 anos ou mais: " + pessoasMaior21);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

        scanner.close();
    }
}
