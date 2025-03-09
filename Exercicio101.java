/*
101. Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.
 */
import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        double maiorValor = Maior(valor1, valor2, valor3); // Chama a função e armazena o resultado

        System.out.println("O maior valor é: " + maiorValor);

        sc.close();
    }

    // Função que retorna o maior dos três valores
    public static double Maior(double valor1, double valor2, double valor3) {
        return Math.max(valor1, Math.max(valor2, valor3)); // Retorna o maior valor entre os três
    }
}
