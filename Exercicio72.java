import java.util.Scanner;
public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro positivo
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Exibe a contagem de 0 até o valor digitado
        System.out.print("Contagem: ");
        for (int i = 0; i <= valor; i++) {
            System.out.print(i);
            if (i < valor) {
                System.out.print(", ");
            }
        }
        System.out.println(", FIM!");

        scanner.close();
    }
}
