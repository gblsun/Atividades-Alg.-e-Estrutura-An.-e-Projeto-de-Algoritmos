import java.util.Scanner;
public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somatorio = 0;
        int numero = 0;

        // Flag para controlar o loop
        while (numero != 1111) {
            System.out.print("Digite um número (ou 1111 para terminar): ");
            numero = scanner.nextInt();

            // Verifica se o número é diferente de 1111
            if (numero != 1111) {
                somatorio += numero;
            }
        }

        // Exibe o resultado final
        System.out.println("O somatório dos números digitados é: " + somatorio);

        // Fecha o scanner
        scanner.close();
    }
}
