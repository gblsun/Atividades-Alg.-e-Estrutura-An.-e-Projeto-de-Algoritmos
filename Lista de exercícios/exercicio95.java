import java.util.Scanner;

/*
95. Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses valores para um procedimento Maior() que vai verificar qual deles é o maior e mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem informando essa característica.
 */
public class exercicio95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.println("Digite o valor2: ");
        double valor2 = sc.nextDouble();
        Maior(valor, valor2);

        sc.close();
    }
    public static void Maior(double valor, double valor2) {
        if (valor > valor2) {
            System.out.println("O maior valor é: " + valor);
        } else if (valor2 > valor) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("Os valores são iguais: " + valor);
        }
    }
}
