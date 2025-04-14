//Passo1 peça a pessoa que informe o primeiro segmento
//Passo2 guarde a medida do segmento 1
//Passo3 peça a pessoa que informe o segundo segmento
//Passo4 guarde a medida do segmento 2
//Passo5 peça a pessoa que informe o terceiro segmento
//Passo6 guarde a medida do segmento 3
//Passo7 crie um elemento de decisão informando se a combinação de soma de dois segmentos for maior que o terceiro segmento escolhido é verdade
//Passo8 exiba uma mensagem após o elemento de decisão SE informando que é um triângulo
//Passo9 crie um elemento de decisão informando senão a combinação de soma de dois segmentos for maior que o terceiro elemento escolhido é verdade
//Passo10 exiba a mensagem após o elemento de decisão SENÃO informando que não é um triângulo

import java.util.Scanner;

public class Exercicio25Desafio {
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        System.out.println("Informe 1° segmento do triângulo: ");
        int primei = triangulo.nextInt();
        System.out.println("Informe o 2° segmento do triângulo: ");
        int segun = triangulo.nextInt();
        System.out.println("Informe o 3° segmento do triângulo: ");
        int terce = triangulo.nextInt();

        if((primei + segun > terce) && (primei + terce > segun) && (segun + terce > primei)){
          System.out.println("É um triângulo.");
        } else{
            System.out.println("Não é um triângulo.");
        }
    }
}
