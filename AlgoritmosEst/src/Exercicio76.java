public class Exercicio76 {
    public static void main(String[] args) {
        // Criação do vetor com 8 posições
        int[] vetor = new int[8];

        // Preenchendo o vetor com os valores conforme o padrão solicitado
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                vetor[i] = 999; // Preenche a primeira linha com 999
            } else {
                vetor[i] = i - 1; // Preenche a segunda linha com 0, 1, 2, 3...
            }
        }

        // Exibindo o vetor na tela
        for (int i = 0; i < 8; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}
