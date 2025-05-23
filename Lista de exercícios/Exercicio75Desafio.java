/*
1° Declarei as variáveis para os primeiros termos da sequência
2° Exibi os dois primeiros termos fixos
3° Usei um loop para calcular e exibir os 8 termos seguintes da sequência
4° Atualizei os valores dos termos anteriores a cada iteração
 */
public class Exercicio75Desafio {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3;

        System.out.println("Os 10 primeiros termos da sequência de Fibonacci são:");

        // Exibe os primeiros dois termos fixos
        System.out.print(n1 + " " + n2 + " ");

        // Calcula e exibe os 8 termos seguintes da sequência
        for (int i = 3; i <= 10; i++) {
            n3 = n1 + n2; // A sequência de Fibonacci é a soma dos dois termos anteriores
            System.out.print(n3 + " ");
            n1 = n2; // Atualiza n1
            n2 = n3; // Atualiza n2
        }
    }
}
