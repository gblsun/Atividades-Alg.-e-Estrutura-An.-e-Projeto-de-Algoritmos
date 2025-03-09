import java.util.Scanner;

public class exercicio_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 0, s = 0, i;

        while (true) {
            System.out.print("Digite a idade do aluno (ou 999 para encerrar): ");
            i = sc.nextInt();

            if (i == 999) {
                break;
            }

            s = s + i;
            t = t + 1;
        }

        if (t > 0) {
            System.out.println("Número de alunos na turma: " + t);
            System.out.println("Média de idade: " + (float) s / t);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }

        sc.close();
    }
}
//• Faça um algoritmo que leia a idade de vários alunos de uma
//turma. O programa vai parar quando for digitada a idade 999. No
//final, mostre quantos alunos existem na turma e qual é a média de
//idade do grupo.