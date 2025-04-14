//Passo1 peça a pessoa que informe o primeiro segmento
//Passo2 guarde a medida do segmento 1
//Passo3 peça a pessoa que informe o segundo segmento
//Passo4 guarde a medida do segmento 2
//Passo5 peça a pessoa que informe o terceiro segmento
//Passo6 guarde a medida do segmento 3
//Passo7 crie um elemento de decisão informando se a combinação de soma de dois segmentos for maior que o terceiro segmento escolhido é verdade
//Passo8 crie um elemento de decisão guiando para segmentos que possam ser iguais
//Passo9 exiba na tela a possível mensagem que indique que é um triângulo equilâtero
//Passo10 crie um elemento de decisão guiando para dois segmentos que possam ser iguais e um diferente
//Passo11 exiba na tela a possível mensagem que indique que é um triângulo isósceles
//Passo12 crie um elemento de decisão guiando para segmentos que possam ser diferentes
//Passo13 exiba na tela a possível mensagem que indique que é um triângulo escaleno

import java.util.Scanner;

public class Exercicio30Desafio {
    public static void main(String[] args) {
        Scanner tipo_trian = new Scanner(System.in);
        System.out.println("Informe o 1° segmento do triângulo: ");
        int seg_1 = tipo_trian.nextInt();
        System.out.println("Informe o 2° segmento do triângulo: ");
        int seg_2 = tipo_trian.nextInt();
        System.out.println("Informe o 3° segmento do triângulo: ");
        int seg_3 = tipo_trian.nextInt();

        if((seg_1 + seg_2 > seg_3) && (seg_1 + seg_3 > seg_2) && (seg_2 + seg_3 > seg_2)){
            if(seg_1 == seg_2 && seg_1== seg_3){
                System.out.println("É um triângulo equilâtero");
            } if(seg_1 == seg_2 && seg_1 != seg_3 || seg_2 == seg_3 && seg_2 != seg_1){
                System.out.println("É um triângulo isósceles");
            } if(seg_1 != seg_2 && seg_1!= seg_3 && seg_2 != seg_3 ){
                System.out.println("É um trângulo escaleno");
            }

        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
