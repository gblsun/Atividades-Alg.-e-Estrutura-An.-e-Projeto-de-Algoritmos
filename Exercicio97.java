import java.util.Scanner;

/*
97. Faça um programa que tenha um procedimento chamado Contador() que recebe três valores como parâmetro: o início, o fim e o incremento de uma contagem. O programa principal deve solicitar a digitação desses valores e passá-los ao procedimento, que vai mostrar a contagem na tela.
-> início,
-> fim,
-> incremento.
 */
public class Exercicio97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de ínicio: ");
        int inicio = sc.nextInt();

        System.out.println("Digite o valor de fim: ");
        int fim = sc.nextInt();

        System.out.println("Digite o valor de incremento: ");
        int incremento = sc.nextInt();

        Contador(inicio, fim, incremento);

        sc.close();
    }
    public static void Contador(int inicio, int fim, int incremento) {
        if (incremento <= 0) {
            System.out.println("O incremento deve ser maior que 0.");
            return;
        }

        System.out.println("Contagem: ");

        // Laço de contagem
        for (int i = inicio; i <= fim; i += incremento) {
            System.out.print(">> "+ i);
        }

        System.out.println(">> FIM");
    }
}
