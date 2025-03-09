import java.util.Scanner;

public class exercicio_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int pri = sc.nextInt();
        System.out.print("Digite o ultimo valor: ");
        int fin = sc.nextInt();
        System.out.print("Digite o incremento valor: ");
        int inc = sc.nextInt();


        for (int i = pri; i <= fin; i += inc) {
            System.out.println(i);

        }
        System.out.println("acabou!");

    }
}
//• Crie um algoritmo que leia o valor inicial da contagem, o
//valor final e o incremento, mostrando em seguida todos os
//valores no intervalo:
//Ex: Digite o
//primeiro Valor: 3
//Digite o último
//Valor: 10 Digite o
//Incremento: 2
//Contagem: 3 5 7 9
//Acabou!


