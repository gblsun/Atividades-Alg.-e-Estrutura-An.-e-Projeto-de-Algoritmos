import java.util.Scanner;

/*
98. [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado Fibonacci()
que recebe um único valor inteiro como parâmetro, indicando quantos termos da sequência
serão mostrados na tela. O seu procedimento deve receber esse valor e mostrar a quantidade
de elementos solicitados. Obs: Use os exercícios 70 e 75 para te ajudar na solução.
Ex: Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
1- Criei o Scanner para ler a entrada do usuário.
2- Solicitei ao usuário o número de termos que ele deseja ver na sequência de Fibonacci.
3- Li o valor inserido pelo usuário.
4- Chamei o procedimento Fibonacci passando o número de termos.
5- Inicializei os dois primeiros termos da sequência (1 e 1).
6- Exibi os primeiros n termos da sequência de Fibonacci.
7- Exibi "FIM" após a sequência.
 */
public class Exercicio98 {
    public static void main(String[] args) {
        // Cria um scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o número de termos que deseja visualizar na sequência de Fibonacci
        System.out.println("Digite o número de valores que deseja ver na sequência de Fibonacci: ");

        // Lê o valor inserido pelo usuário
        int n1 = sc.nextInt();

        // Chama o procedimento Fibonacci, passando o valor inserido pelo usuário
        Fibonacci(n1);
    }

    // Procedimento Fibonacci: recebe um número n e exibe os n primeiros termos da sequência
    public static void Fibonacci(int n) {
        // Inicializa os dois primeiros termos da sequência de Fibonacci (1 e 1)
        int a = 1, b = 1;

        // Exibe os primeiros n termos da sequência
        for (int i = 0; i < n; i++) {
            // Imprime o valor atual de a seguido de " >> "
            System.out.print(a + " >> ");

            // Atualiza os valores de a e b para o próximo par de termos
            int temp = a;
            a = b;
            b = temp + b;
        }

        // Exibe FIM após a exibição da sequência
        System.out.println("FIM");
    }
}
