import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner maiormenor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int first = maiormenor.nextInt();
        System.out.println("Insira o segundo valor: ");
        int second = maiormenor.nextInt();
        maiormenor.close();

        if(first > second){
            System.out.println("O primeiro valor é maior.");
        } else if(first == second){
            System.out.println("Não existe valor maior, os dois são iguais");
        } else{
            System.out.println("O segundo valor é maior.");
        }
    }
}
