/*
Exercício 83 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta de Tecnologia

83.Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.
 */
import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
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
