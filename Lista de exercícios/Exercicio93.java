/*
93. Crie um programa que melhore o procedimento Gerador() da questão anterior para
que o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~
~~~~ Portugol
Studio Portugol
Studio Portugol
Studio
~~~~~~~~:::::::~~~~~~~
 */

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do usuário
        System.out.println("Digite a mensagem: ");
        String mensagem = sc.nextLine();

        System.out.println("Escolha a borda (1, 2 ou 3): ");
        int borda = sc.nextInt();

        System.out.println("Quantas vezes a mensagem será repetida? ");
        int repeticoes = sc.nextInt();

        // Chamada do procedimento Gerador()
        Gerador(mensagem, borda, repeticoes);

        sc.close();
    }

    public static void Gerador(String mensagem, int borda, int repeticoes) {
        String bordaStr = ""; // Nova variável para armazenar a borda

        // Definição da borda com base na escolha do usuário
        switch (borda) {
            case 1:
                bordaStr = "+-------=======------+";
                break;
            case 2:
                bordaStr = "~~~~~~~~:::::::~~~~~~~";
                break;
            case 3:
                bordaStr = "<<<<<<<<------->>>>>>>";
                break;
            default:
                System.out.println("Opção de borda inválida! Usando padrão (Borda 1).");
                bordaStr = "+-------=======------+";
        }

        // Exibir borda superior
        System.out.println(bordaStr);

        // Exibir mensagem repetida
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(mensagem);
        }

        // Exibir borda inferior
        System.out.println(bordaStr);
    }
}
