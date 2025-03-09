import java.util.Scanner;

public class exercicio_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o primeiro valor: ");
            int pri = sc.nextInt();

            System.out.print("Digite o ultimo valor: ");
            int fin = sc.nextInt();

            System.out.print("Digite o incremento valor: ");
            int inc = sc.nextInt();

            if (pri >= fin) {
                System.out.println("Erro! O último valor deve ser maior que o primeiro. Tente novamente.");
            } else {
                for (int i = pri; i <= fin; i += inc) {
                    System.out.println(i);
                }
                break;
            }
        }
        System.out.print("acabou! ");
    }
}
//• O programa acima vai ter um problema quando digitarmos o
//primeiro valor maior que o último. Resolva esse problema com um
//código que funcione em qualquer situação.