import java.text.NumberFormat;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner funcio = new Scanner(System.in);
        System.out.println("Qual é o seu nome?: ");
        String name = funcio.nextLine();
        System.out.println("Informe o seu salário atual: ");
        Double sal = funcio.nextDouble();
        System.out.println("Há quantos trabalha nessa empresa?: ");
        int years = funcio.nextInt();
        funcio.close();

        if(years <= 3) {
            Double perce_1 = (sal * 3) / 100;
            Double aumen_1 = sal + perce_1;
            System.out.println(name + ", seu salário foi reajustado para " + NumberFormat.getCurrencyInstance().format(aumen_1));

        } else if(years > 3 && years < 10) {
            Double perce_2 = (sal * 12.5) / 100;
            Double aumen_2 = sal + perce_2;
            System.out.println( name + ", seu salário foi reajustado para " + NumberFormat.getCurrencyInstance().format(aumen_2));

        } else {
            Double perce_3 = (sal * 20) / 100;
            Double aumen_3 = sal + perce_3;
            System.out.println(name + ", seu salário foi reajustado para " + NumberFormat.getCurrencyInstance().format(aumen_3));
        }
    }
}
