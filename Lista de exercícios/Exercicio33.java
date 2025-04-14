import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner house = new Scanner(System.in);
        System.out.println("Informe o valor do imóvel: ");
        Double casa = house.nextDouble();
        System.out.println("Informe o seu salário: ");
        Double sal = house.nextDouble();
        System.out.println("Em quantos anos irá pagar a casa?: ");
        int years = house.nextInt();

        int meses = years * 12;
        Double prestacao = casa / meses;
        Double porcem_sal = (sal * 30) /100;

        if (prestacao <= porcem_sal){
            System.out.println("Empréstimo aprovado! A mensalidade será de " + NumberFormat.getCurrencyInstance().format (prestacao));
        }
        else{
            System.out.println("Empréstimo negado! A mensalidade irá exceder os 30% do seu salário.");
        }
    }
}
