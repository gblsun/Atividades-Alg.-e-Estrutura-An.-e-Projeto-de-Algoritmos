public class Exercicio77 {
    public static void main(String[] args) {
        // Criação de dois vetores com 10 posições
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Preenchendo o vetor1 com a sequência decrescente de 9 a 0
        for (int i = 0; i < 10; i++) {
            vetor1[i] = 9 - i; // Preenche de 9 a 0
        }

        // Preenchendo o vetor2 com a sequência crescente de 0 a 9
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
