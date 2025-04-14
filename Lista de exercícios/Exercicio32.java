import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sorteio = new Scanner(System.in);
        Random mega = new Random();
        System.out.println("Adivinhe o número a ser sorteado de 1 a 5: ");
        int num_chute = sorteio.nextInt();
        int num_lucky = mega.nextInt(5) + 1;

        if (num_chute == num_lucky){
            System.out.println("Você acertou!");
        }
        else {
            System.out.println("Você errou");
        }
    }
}
