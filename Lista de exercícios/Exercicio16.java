/* Exercício 16 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 20/02/2025.

16 [DESAFIO] Escreva um programa em Python para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos
dias de vida um fumante perderá e exiba o total em dias.

1° Solicitei o número de cigarros fumados por dia  
2° Solicitei o número de anos que a pessoa fumou  
3° Calculei a quantidade total de minutos perdidos devido ao fumo  
4° Convertei os minutos perdidos para dias  
5° Exibi a quantidade de dias de vida perdidos  

*/
package Lista;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o número de cigarro que você fuma por dia: ");
        int n = sc.nextInt();
        System.out.printf("Digite o número de anos que fumou na vida: ");
        int ano = sc.nextInt();
        int minutosAno = (60 * (24 * 365));
        System.out.println("Você perdeu: " + ((((minutosAno * n) / 10) / 60) / 24) + " dias de vida");
        sc.close();
    }
}
