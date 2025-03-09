//Passo1 peça para a pessoa escolher um número de 1 a 3 que esteja relacionado com papel, pedra e tesoura
//Passo2 guarde o número informado pela pessoa
//Passo3 guarde um número aleatório gerado pela máquina de 1 a 3
//Passo4 crie uma estrutura que exibirá o número provável que a máquina escolhe para lançar
//Passo5 crie o caso 1
//Passo6 exiba na tela papel referente ao número 1
//Passo7 crie o caso 2
//Passo8 exiba na tela pedra referente ao número 2
//Passo9 crie o caso 3
//Passo10 exiba na tela tesoura referente ao número 3
//Passo11 crie um elemento de decisão SE caso os números do computador e da pessoa sejam iguais
//Passo12 exiba na tela a provável mensagem empate
//Passo13 crie um elemento de decisão SESENÃO caso o número da pessoa menos o número do computador resulte em -1 ou 2 referente ao encontro papel da pessoa e pedra do computador ou tesoura da pessoa e papel do computador
//Passo14 exiba na tela a provável mensagem de vitória
//Passo15 crie um elemento de decisão SENÃO
//Passo 16 exiba na tela a provável mensagem de derrota

import java.util.Scanner;
import java.util.Random;

public class Ex31Desafio {
    public static void main (String[] args) {
        Scanner jokenpo = new Scanner(System.in);
        Random jogo = new Random();
        System.out.println("Escolha entre papel(1), pedra(2), tesoura(3).");
        int num_player = jokenpo.nextInt();
        int computer = jogo.nextInt(3) + 1;

        switch(computer){
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("pedra");
                break;
            case 3:
                System.out.println("tesoura");
                break;
        }

        if(num_player == computer) {
            System.out.println("Empate.");
        }
        else if((num_player - computer) == -1 || (num_player - computer) == 2){
            System.out.println("Você venceu.");
        }
        else{
            System.out.println("Você perdeu.");
        }
    }
}