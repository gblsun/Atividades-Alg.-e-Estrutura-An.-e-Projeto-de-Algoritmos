/*
82. Escreva um programa que leia 15 números e guarde-os em um vetor. No final, mostre o vetor inteiro na tela e em seguida mostre em que posições foram digitados valores que são múltiplos de 10.
 */

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número n°" + (i + 1) + ": ");
            vetor[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("\nValores digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("\nPosições com múltiplos de 10: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 10 == 0) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }
    }
}
