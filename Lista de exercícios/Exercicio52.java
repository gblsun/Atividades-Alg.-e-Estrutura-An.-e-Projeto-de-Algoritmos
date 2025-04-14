import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total_ida = 0;
        int Maior18 = 0;
        int Menor5 = 0;
        int maior_ida = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            total_ida += idade;

            if (idade > 18) {
                Maior18++;
            }

            if (idade < 5) {
                Menor5++;
            }

            if (idade > maior_ida) {
                maior_ida = idade;
            }
        }

        double mediaIdade = total_ida / 10.0;

        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Pessoas com mais de 18 anos: " + Maior18);
        System.out.println("Pessoas com menos de 5 anos: " + Menor5);
        System.out.println("Maior idade: " + maior_ida);

    }
}