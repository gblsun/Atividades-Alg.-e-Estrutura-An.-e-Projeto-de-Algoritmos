import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner eleitor = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?: ");
        int estrela = eleitor.nextInt();
        System.out.println("Em que ano você vai querer votar?: ");
        int urna = eleitor.nextInt();

        int podevotar = urna - estrela;

        if (podevotar > 18){
            System.out.println("Já pode votar.");
        } else {
            System.out.println("Você ainda não pode votar.");
        }
    }
}
