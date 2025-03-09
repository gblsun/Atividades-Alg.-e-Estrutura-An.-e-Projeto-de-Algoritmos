public class Exercicio79 {
    public static void main(String[] args) {
        // Criação de dois vetores com 10 posições
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Preenchendo o vetor1 alternando entre 5 e 3
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetor1[i] = 5; // Para índices pares, o valor será 5
            } else {
                vetor1[i] = 3; // Para índices ímpares, o valor será 3
            }
        }

        // Preenchendo o vetor2 com a sequência de 0 a 9
        for (int i = 0; i < 10; i++) {
            vetor2[i] = i; // Preenche de 0 a 9
        }

        // Exibindo os vetores na tela
        System.out.print("Vetor 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println(); // Quebra de linha

        System.out.print("Vetor 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
