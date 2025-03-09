/*

81. Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.
 */

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        String[] vetor = new String[7];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o nome n°" + (i + 1) + ": ");
            vetor[i] = new Scanner(System.in).nextLine();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
