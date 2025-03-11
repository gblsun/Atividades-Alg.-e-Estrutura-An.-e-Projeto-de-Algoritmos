public class Exercicio46 {


public static void main(String[] args) {

    int soma = 0;
    for (int i = 6; i <= 100; i += 2 ) {
        System.out.print(i + " +");
        soma += i;
    }
    System.out.println();
    System.out.println("a soma igual a : " + soma);


    }

}
//• Crie um programa que calcule e mostre na tela o resultado da
//soma entre 6 +
//        8 + 10 + 12 + 14 + ... + 98 + 100.
