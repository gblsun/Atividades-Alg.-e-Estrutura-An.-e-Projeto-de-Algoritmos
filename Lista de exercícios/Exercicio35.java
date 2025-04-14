import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);

        System.out.println("Qual carro foi alugado? Popular(1) ou Luxo(2): ");
        int poplux = car.nextInt();

        System.out.println("Quantos quilômetros foram rodados?: ");
        int km = car.nextInt();

        System.out.println("Há quantos dias esteve com ele?: ");
        int days = car.nextInt();

        double total = 0;

        if (poplux == 1) {
            if (km <= 100) {
                total = (km * 0.20) + (days * 90);
            } else {
                total = (km * 0.10) + (days * 90);
            }
        } else if (poplux == 2) {
            if (km <= 200) {
                total = (km * 0.30) + (days * 150);
            } else {
                total = (km * 0.25) + (days * 150);
            }
        } else {
            System.out.println("Tipo de carro inválido!");
            return;
        }
        System.out.println("O total será de " + NumberFormat.getCurrencyInstance().format(total));
    }
}