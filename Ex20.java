import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner impapar = new Scanner(System.in);
        System.out.println("Insira um número para ver se é ímpar ou par: ");
        int oqueeh = impapar.nextInt();

        int teste = oqueeh % 2;

        if (teste == 0) {
            System.out.println("O número é par.");
        } else{
            System.out.println("O número é ímpar.");
        }
    }
}
