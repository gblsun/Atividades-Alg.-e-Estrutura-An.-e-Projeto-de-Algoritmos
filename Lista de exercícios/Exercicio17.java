import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner multa = new Scanner(System.in);
        System.out.println("Há quantos km/h o carro está?: ");
        int km = multa.nextInt();
        int contador = km -80;
        multa.close();

        if (km>80){
            int taxed = contador * 5;
            System.out.println("Sua multa é de " + NumberFormat.getCurrencyInstance().format(taxed));
        }
    }
}
