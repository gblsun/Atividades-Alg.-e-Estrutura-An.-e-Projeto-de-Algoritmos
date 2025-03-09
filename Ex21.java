import java.util.Scanner;

public class Ex21 {
    public static void main (String[] args) {
        Scanner anobi = new Scanner(System.in);
        System.out.println("Que ano gostaria de ver se é bissexto?: ");
        int ano = anobi.nextInt();
        anobi.close();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano de " + ano + " é bissexto.");
        } else {
            System.out.println("O ano de " + ano + " não é bissexto.");
        }
    }
}
