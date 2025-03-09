/*
100. Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal.
 */
import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = calcularMedia(nota1, nota2); // Chamada da função

        System.out.println("+ ================== +");
        System.out.println("A média do aluno é: " + media);
        System.out.println("+ ================== +");

        sc.close(); // Boa prática: Fechar o Scanner
    }

    // Função que recebe duas notas e retorna a média
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}