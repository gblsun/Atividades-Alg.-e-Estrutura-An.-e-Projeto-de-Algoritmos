import java.util.Scanner;
public class Exercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número para a tabuada
        System.out.print("Digite um valor: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada usando a estrutura "para"
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
