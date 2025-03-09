/*
102. Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
 */
import java.util.Scanner;

public class Exercicio102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = SuperSomador(num1, num2); // Chama a função SuperSomador

        System.out.println("A soma dos valores no intervalo é: " + resultado);

        sc.close();
    }

    // Função que recebe dois números e retorna a soma dos valores no intervalo
    public static int SuperSomador(int num1, int num2) {
        int soma = 0;

        // Garantir que o intervalo seja sempre do menor ao maior número
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        // Soma todos os valores no intervalo, inclusive os próprios números
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        return soma;
    }
}


