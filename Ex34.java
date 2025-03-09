import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args){
        Scanner imc = new Scanner(System.in);
        System.out.println("Quantos quilos você pesa?: ");
        Double kg = imc.nextDouble();
        System.out.println("Informe a sua altura: ");
        Double height = imc.nextDouble();

        Double health = kg * (height * height);

        if(health < 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        else if(health >= 18.5 && health <= 25){
            System.out.println("Peso ideal");
        }
        else if(health > 25 && health <= 30){
            System.out.println("Sobrepeso");
        }
        else if(health > 30 && health <= 40){
            System.out.println("Obesidade");
        }
        else{
            System.out.println("Obesidade mórbida");
        }
    }
}
