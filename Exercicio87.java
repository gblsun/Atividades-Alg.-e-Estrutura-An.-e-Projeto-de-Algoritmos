/*
87. [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.

Passos:
1° Adicionei a biblioteca Random
2° Gerei um vetor tamanho 20
3° Randomizei valores de 0 a 99
4° ordenei o vetor usando o .sort
5° mostrei o vetor
 */
import java.util.Arrays;
import java.util.Random;

public class Exercicio87 {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Random gerador = new Random(); // Objeto da classe random
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100); // Gera um número entre 0 e 99
        }
        // Mostra os valores gerados
        System.out.println("Valores gerados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        // Ordena o vetor
        Arrays.sort(vetor);

        // Mostrando os valores ordenados
        System.out.println("\nValores ordenados: ");
        for (int valor : vetor) {
            System.out.println(valor + "");
        }
    }
}
