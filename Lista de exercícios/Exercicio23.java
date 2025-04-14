import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner individuo = new Scanner(System.in);
        System.out.println("Qual é o seu nome?: ");
        String name = individuo.nextLine();
        System.out.println("Qual é o seu sexo feminino (1) ou masculino (2)?: ");
        int sexo = individuo.nextInt();
        System.out.println("Qual o preço da compra?: ");
        Double mercadoria = individuo.nextDouble();
        individuo.close();

        if(sexo == 1) {
            Double descon_rosa = (mercadoria * 13) / 100;
            Double preco_rosa = mercadoria - descon_rosa;
            System.out.println("Meus parabêns a senhorita ganhou um desconto de " + NumberFormat.getCurrencyInstance().format(descon_rosa));

        } else {
            Double descon_maxu = (mercadoria * 5) / 100;
            Double preco_maxu = mercadoria - descon_maxu;
            System.out.println("O senhor ganhou um desconto de " + NumberFormat.getCurrencyInstance().format(descon_maxu));
        }
    }
}
