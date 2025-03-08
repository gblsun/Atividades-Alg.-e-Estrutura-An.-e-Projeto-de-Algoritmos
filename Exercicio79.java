

/* Exerc
79. Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico com 15 posições com os primeiros elementos da sequência de Fibonacci:
1 1 2 3 5 8 13  21  34  55  89  144  233  377  610  987 ( valores da sequência de Fibonacci)
0 1 2 3 4 5 6 7 8 9 10  11 12 13 14 15 (posição do índice)
 */

public class Exercicio79 {
    public static void main(String[] args) {
        int[] sequencia = new int[15];
        /**Criação do vetor:
         * Para isso foi criado um vetor de inteiros chamado ->sequencia<- com 15 posições, onde será armazenado os primeiros numeros da sequência de Fibonacci.
         *
         */

        sequencia[0] = 0;
        sequencia[1] = 1;
        /** Inicialização dos dois primeiros valores da sequência:
         * Definimos manualmente os dois primeiros números da sequência de Fibonacci ->0<- e ->1<-.
         */

        for (int i = 2; i < 15; i++) {
            sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
        }
        /**
         * Preenchimento do vetor com a lógica da sequência de Fibonacci:
         * Usamos um ->For<- para preencher o vetor a partir da posição 2 até a posição 2 até a posição 14.
         * A cada iteração, o númeor atual (sequencia[i]) é calculado somando os dois anteriores (sequencia[i-1] + sequencia[i - 2])
         */

        System.out.println("Os primeiros 15 elementos da sequência de Fibonacci são: ");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
        /**
         * Exibição dos resultados.
         */
    }
}
