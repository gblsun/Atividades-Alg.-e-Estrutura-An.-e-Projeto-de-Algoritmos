import java.util.Scanner;

/*
85.Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No final,
mostre:
    Qual é a média de idade das pessoas cadastradas
    Em quais posições temos pessoas com mais de 25 anos
    Qual foi a maior idade digitada (podem haver repetições) Em que posições digitamos a maior idade
 */
public class Exercicio85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[8];
        int soma = 0;
        int maiorIdade = Integer.MIN_VALUE;
        /**
         * `Integer.MIN_VALUE` é usado para garantir que qualquer idade digitada será maior que o valor inicial, permitindo encontrar corretamente a maior idade do vetor.
         *
         * Integer.MAX_VALUE,  ele é adequado quando você está procurando o menor valor em um conjunto de dados.
         */
        // ----------> Leitura das idades e cálculo da soma
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o número n°" + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
            soma += vetor1[i]; // soma é igual à soma mais vetor1[i]
            if (vetor1[i] > maiorIdade) {
                maiorIdade = vetor1[i];
            }
        }
        sc.close();

        // ----------> Cálculo da média
        double media = (double) soma / vetor1.length;
        System.out.println("\nA média das idades é " + media);

        // ----------> Pessoas com mais de 25 anos
        System.out.println("Pessoas com mais de 25 anos estão nas posições: ");
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == 25) {
                System.out.print(i + "");
            }
        }

        // ----------> Exibir a maior idade e suas posições
        System.out.println("\nA maior idade digitada foi: " + maiorIdade);
        System.out.println("A maior idade aparaece nas posições: ");
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == maiorIdade) {
                System.out.println(i + "");
                /**
                 * Essa condição verifica se o elemento atual do vetor é igual à maior idade encontrada. Se for, significa que essa idade apareceu nessa posição.
                 */
            }
        }
    }
}
