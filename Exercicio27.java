import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Insira a 1° nota: ");
        Double nota1 = save.nextDouble();
        System.out.println("Insira a 2° nota: ");
        Double nota2 = save.nextDouble();

        Double media = (nota1 + nota2)/2;

        if (media < 5.0){
            System.out.println("Reprovado");
        } else if(media >= 5.0 && media <= 6.9){
            System.out.println("Recuperação");
        } else {
        System.out.println("Aprovado");
        }
    }
}
