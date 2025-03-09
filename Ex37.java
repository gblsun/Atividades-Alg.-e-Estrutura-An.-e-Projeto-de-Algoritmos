import java.text.NumberFormat;
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sex = new Scanner(System.in);
        System.out.println("Qual o seu sexo? (1)feminino ou (2)masculino: ");
        int sexo = sex.nextInt();
        System.out .println("Há quanto tempo trabalha aqui?: ");
        int anos = sex.nextInt();
        System.out.println("Informe o seu salário: ");
        Double sal = sex.nextDouble();

        if (sexo == 1){
            if(anos < 15){
                Double cento_novata = (sal * 5) / 100;
                Double sal_novata = sal + cento_novata;
                System.out.println("O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_novata));
            
            } else if ( anos >= 15 && anos < 20) {
                Double cento_plena = (sal * 12) / 100;
                Double sal_plena = sal + cento_plena;
                System.out.println("O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_plena));

            } else {
                Double cento_seniora = (sal * 23) / 100;
                Double sal_seniora = sal + cento_seniora;
                System.out.println("O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_seniora));
            }
        } else {
            if (anos < 20){
                Double cento_novato = (sal * 3) / 100;
                Double sal_novato = (sal + cento_novato);
                System.out.println("O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_novato));
            } else if (anos >= 20 && anos < 30) {
                Double cento_pleno = (sal * 13) / 100;
                Double sal_pleno = (sal + cento_pleno);
                System.out.println(" O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_pleno));
            } else {
                Double cento_senior = (sal * 25) / 100;
                Double sal_senior = (sal + cento_senior);
                System.out.println("O seu salário foi atualizado para " + NumberFormat.getCurrencyInstance().format(sal_senior));
            }
        }
    }
}
