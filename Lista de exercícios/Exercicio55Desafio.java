import java.util.Random;
import java.util.Scanner;

public class Exercicio55Desafio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativas = 4;

        System.out.println("Adivinhe o número de 1 a 10! Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
                return;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("O número é menor!");
            }
        }

        System.out.println("Fim de jogo! O número era " + numeroSecreto + ".");
        scanner.close();
    }
}


