/*
Exercício 84 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta de Tecnologia

84.Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador. Depois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi encontrada. Mostre também quantas vezes a chave foi sorteada.
 */
import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        int[] vetor = new int[30];
        for (int i = 0; i == 15; i++) {
            System.out.print("Digite o número n°" + (i + 1) + ": ");
            vetor[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("\nValores digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("\nPosições com números pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }
    }
}
