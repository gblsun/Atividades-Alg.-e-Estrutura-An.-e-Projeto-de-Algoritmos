import java.util.Scanner;

/*
94. Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses valores para um procedimento Somador() que vai calcular e mostrar a soma entre eles.
 */
public class Exercicio94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        somador(valor, valor2);
    }
    public static void somador(double valor, double valor2) {
        double soma = valor + valor2;
        System.out.println("A soma dos valores é: " + soma);
    }
}
