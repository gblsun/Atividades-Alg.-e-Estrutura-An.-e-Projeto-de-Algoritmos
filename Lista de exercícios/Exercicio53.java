import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float tIdade = 0;
        int tHomens = 0;
        int tMulheres = 0;
        float tIdadeHomens = 0;
        int mMais20 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo da pessoa " + i + " (M masculino, F feminino): ");
            char sexo = scanner.next().charAt(0);

            tIdade += idade;

            if (sexo == 'M' || sexo == 'm') {
                tHomens++;
                tIdadeHomens += idade;
            } else if (sexo == 'F' || sexo == 'f') {
                tMulheres++;
                if (idade > 20) {
                    mMais20++;
                }
            }
        }

        float mediaIdade = tIdade / 5.0f;
        float mediaIdadeHomens = tHomens > 0 ? tIdadeHomens / (float) tHomens : 0;

        System.out.println("Homens : " + tHomens);
        System.out.println("Mulheres : " + tMulheres);
        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Mulheres com mais de 20 anos: " + mMais20);

        scanner.close();
    }
}



//• Faça um programa que leia a idade e o sexo de 5 pessoas,
//mostrando no final:
//        • Quantos homens foram cadastrados
//• Quantas mulheres foram cadastradas
//• A média de idade do grupo
//• A média de idade dos homens
//• Quantas mulheres tem mais de 20 anos
