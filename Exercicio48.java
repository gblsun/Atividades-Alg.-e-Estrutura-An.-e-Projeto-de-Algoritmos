import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o " + i + " número: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma é: " + soma);


    }
}

//• Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.
