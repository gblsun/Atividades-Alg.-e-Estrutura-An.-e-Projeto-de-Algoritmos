import java.util.Scanner;

/*
Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um
vetor. No final, mostre:
    Qual é a média da turma
    Quantos alunos estão acima da média da turma
    Qual foi a maior nota digitada
        Em que posições a maior nota aparece
 */
public class Exercicio86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double maiorNota = 0; // deve-se iniciar em zero, pois notas são sempre positivas
        double nota[] = new double[10];

        // Entrada das Notas
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota do " + (i + 1) + ": ");
            nota[i] = sc.nextDouble();

            while (nota[i] < 0 || nota[i] > 10) {
                System.out.println("Nota inválida! Digite Novamente");
                nota[i] = sc.nextDouble();
            }

            soma += nota[i];

            // Atualiza a maior nota encontrada
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
            }
        }
        sc.close();

        // Calcula a média da turma
        double media = soma / nota.length;
        System.out.println("\nA me´dia da turma é: " + media);

        // Conta alunos acima da média
        int acimaMedia = 0;
        for (double n : nota) {
            if (n > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de alunos acima da media: " + acimaMedia);

        // Exibe a maior nota e suas posições
        System.out.println("A maior nota digitada foi: " + maiorNota);
        System.out.println("A maior nota aparece nas posições: ");
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] == maiorNota) {
                System.out.println(i + "");
            }
        }
        System.out.println();
    }
}
