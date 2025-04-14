/*
104. Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber
como parâmetro o resultado retornado pela função Media().

 */
import java.util.Scanner;

public class Exercicio104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = Media(nota1, nota2); // Chama a função Media para calcular a média

        System.out.println("A média do aluno é: " + media);

        String situacao = Situacao(media); // Chama a função Situacao para determinar a situação
        System.out.println("Situação do aluno: " + situacao);

        sc.close();
    }

    // Função que calcula a média das notas
    public static double Media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Função que recebe a média e retorna a situação do aluno
    public static String Situacao(double media) {
        if (media >= 7) {
            return "APROVADO";
        } else if (media >= 4) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }
}
