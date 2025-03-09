/*
103. Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25
 */
import java.util.Scanner;

public class Exercicio103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = Potencia(base, expoente); // Chama a função Potencia

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        sc.close();
    }

    // Função que calcula a potência de um número (base^expoente)
    public static int Potencia(int base, int expoente) {
        int resultado = 1;

        // Calcula a potência de base^expoente
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
