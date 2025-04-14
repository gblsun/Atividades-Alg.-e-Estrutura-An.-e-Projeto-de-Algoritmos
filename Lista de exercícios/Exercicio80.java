/*

80. Crie um programa que preencha automaticamente um vetor numérico com 7 números
gerados aleatoriamente pelo computador e depois mostre os valores gerados na tela.
 */
import java.util.Random;

public class Exercicio80 {
    public static void main(String[] args) {
        int[] vetor = new int[7]; // Vetor com 7 posições
        Random gerador = new Random(); // Objeto da classe random

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100); // Gera um número entre 0 e 99
        }
        /**
         * i:  é uma variável contadora
         * int i = 0:  inicializa a variável i com o valor 0.
         * i < vetor.length: O laço continua enquanto i for menor que o tamanho do vetor (7).
         * ---> length: comprimento" ou "tamanho"
         * i++: A cada iteração, a variável i é incrementada em 1.
         *
         * Esse laço percorre todos os índices do vetor (de 0 a 6) e executa o código dentro dele.
         */

        // Mostra os valores gerados
        System.out.println("Valores gerados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            /**
             *
             */
        }
    }
}
