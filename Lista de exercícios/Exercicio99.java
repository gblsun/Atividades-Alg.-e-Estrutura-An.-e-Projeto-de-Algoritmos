/*
99. Refaça o exercício 90, só que agora em forma de função Somador(), que vai receber
dois parâmetros e vai retornar o resultado da soma entre eles para o programa
principal.

 */
import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        somador(valor, valor2);

        sc.close();
    }

    public static void somador(double valor, double valor2) {
        double soma = valor + valor2;
        System.out.println("+ ======= +");
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("+ ======= +");
    }
}


