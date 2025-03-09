import java.util.Scanner;
public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados
        int mulheres = 0;
        int homensMaisDe100Kg = 0;
        double somaPesoMulheres = 0;
        double maiorPesoHomens = 0;

        // Laço para ler os dados de 8 pessoas
        for (int i = 1; i <= 8; i++) {
            System.out.println("Pessoa " + i + ":");

            // Lê o sexo da pessoa
            System.out.print("Digite o sexo (M para homem, F para mulher): ");
            char sexo = scanner.next().charAt(0);

            // Lê o peso da pessoa
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();

            // Processa os dados conforme o sexo
            if (sexo == 'F' || sexo == 'f') {
                mulheres++;
                somaPesoMulheres += peso;
            } else if (sexo == 'M' || sexo == 'm') {
                if (peso > 100) {
                    homensMaisDe100Kg++;
                }
                if (peso > maiorPesoHomens) {
                    maiorPesoHomens = peso;
                }
            }
        }

        // Exibe os resultados
        if (mulheres > 0) {
            System.out.println("Número de mulheres cadastradas: " + mulheres);
            System.out.println("Média de peso entre as mulheres: " + (somaPesoMulheres / mulheres));
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }

        System.out.println("Número de homens que pesam mais de 100Kg: " + homensMaisDe100Kg);
        System.out.println("Maior peso entre os homens: " + maiorPesoHomens);

        scanner.close();
    }
}
