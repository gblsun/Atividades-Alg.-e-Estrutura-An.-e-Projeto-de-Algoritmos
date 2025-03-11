import java.util.Scanner;

public class Exercicio22 {
    public static void main (String[] args) {
        Scanner meiofio = new Scanner(System.in);
        System.out.println("Quantos anos têm?: ");
        int apresentar = meiofio.nextInt();

        if(apresentar < 18) {
            int bisonho = 18 - apresentar;
            System.out.println("Faltam " + bisonho + " anos para se apresentar ao exército brasileiro.");
        } else {
            int fujaum = apresentar - 18;
            System.out.println("Você já está à " + fujaum + " anos sem ter se apresentado ao exército, apresente-se para regularizar seus documentos imediatamente!");
        }
    }
}
