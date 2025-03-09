import java.util.Scanner;

public class exercicio_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 1; i <= 6; i ++ ) {
            System.out.println("digete numeros inteiros");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
                System.out.println();

            }else {
                impares++;
            }
        }
        System.out.println("tem "+pares+" numeros pares e "+impares+" impares" );
    }
}

//• Crie um programa que leia 6 números inteiros e no final mostre
//quantos deles são pares e quantos são ímpares
