import java.util.Scanner;

/*
96. Crie uma lógica que leia um número inteiro e passe para um procedimento  ParOuImpar() que vai verificar e mostrar na tela se o valor passado como parâmetro é PAR ou ÍMPAR.
 */
public class Exercicio96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();
        ParOuImpar(valor);
    }

    public static void ParOuImpar(int valor) {
        if (valor % 2 == 0) {
            System.out.println(valor + " é par");
        } else {
            System.out.println(valor + " é par");
        }
    }

}
