//CÓDIGO EM JAVA
//Função recursiva que calcula o fatorial de um número N

import java.util.Scanner;

public class FatorialRecursivo {
    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println(fatorial(numero));
        scanner.close();
    }
}
