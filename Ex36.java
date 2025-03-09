import java.text.NumberFormat;
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args){
        Scanner health =new Scanner(System.in);
        System.out.println("Quantas horas de exercícios foram feitas nesse mês?: ");
        int hours = health.nextInt();

        if(hours <= 10){
            int frango = hours * 2;
            Double dindin_1 = frango * 0.05;
            System.out.println("Foi adicionado " + NumberFormat.getCurrencyInstance().format(dindin_1) + " a sua conta. Você alcançou " + frango + " pontos.");

        } else if (hours > 10 && hours <= 20){
            int intermedio = hours * 5;
            Double dindin_2 = intermedio * 0.05;
            System.out.println("Foi adicionado " + NumberFormat.getCurrencyInstance().format(dindin_2) + " a sua conta. Você alcançou " + intermedio + " pontos.");

        } else {
            int monstro = hours * 10;
            Double dindin_3 = monstro * 0.05;
            System.out.println("Foi adicionado " + NumberFormat.getCurrencyInstance().format(dindin_3) + " a sua conta. Você alcançou " + monstro + " pontos.");
        }
    }
}
