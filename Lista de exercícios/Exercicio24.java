import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner viagem = new Scanner(System.in);
        System.out.println("Quantos quilômetros deseja viajar?:");
        int travel = viagem.nextInt();

        if(travel <= 200){
            Double preco_via = travel * 0.50;
            System.out.println("A viagem custará " + NumberFormat.getCurrencyInstance().format(preco_via));

        } else {
            Double preco_via2 = travel * 0.45;
            System.out.println("A viagem custará " + NumberFormat.getCurrencyInstance().format(preco_via2));
        }
    }
}
