import java.util.Scanner;

/*
88. Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses valores em dois vetores, em posições relacionadas. No final, mostre uma listagem contendo apenas os dados das pessoas menores de idade.
 */
public class Exercicio88 {
    public static void main(String[] args) {
        String[] nome = new String[9];
        int[] idade = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome n°" + (i + 1) + ": ");
            nome[i] = sc.nextLine();

            System.out.println("Digite a idade da/o " + nome[i] + ": ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Pessoas menores de idade: ");
        for (int i = 0; i < nome.length; i++) {
            if (idade[i] < 18) {
                System.out.println("\n" + nome[i] + "possui " + idade[i] + " anos");
            }
        }

        sc.close();
    }
}
