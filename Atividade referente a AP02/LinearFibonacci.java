//CÓDIGO EM JAVA
//Função que retorna o número de fibonacci de n, Usando uma abordagem LinearFibonacci

import java.util.Scanner;

public class LinearFibonacci {
    public static int linearFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Fibonacci de " + numero + " é: " + linearFib(numero));
        scanner.close();
    }
}
