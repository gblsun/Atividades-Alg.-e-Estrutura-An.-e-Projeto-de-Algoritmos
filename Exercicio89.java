import java.util.Scanner;

/*
89. Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e guarde esses dados em três vetores. No final, mostre uma listagem contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
 */
public class Exercicio89 {
    public static void main(String[] args) {
        String[] nome = new String[5];
        String[] sexo = new String[5];
        int[] salario = new int[5];
        Scanner sc = new Scanner(System.in);

        // Abstração dos dados
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome n°" + (i + 1) + ": ");
            nome[i] = sc.nextLine();

            System.out.println("Digite o sexo da/o " + nome[i] + ": ");
            sexo[i] = sc.nextLine().toUpperCase();
            /**
             * é importante utilizar o .toUpperCase() para normalizar e para evitar erros de comparação
             */

            System.out.println("Digite o salario da/o " + nome[i] + ": ");
            sexo[i] = sc.nextLine();

            sc.nextLine();
        }

        // listagem contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
    }
}
