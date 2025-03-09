import java.util.Scanner;

//        • Faça um algoritmo que pergunte ao usuário um número
//inteiro e positivo qualquer e mostre uma contagem até esse
//valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um número inteiro e positivo qualquer");
        int numero = sc.nextInt();

        if (numero % 2 == 1) {
            System.out.println("não funciona");
        }
        else{
                for (int i = 1; i <= numero; i++) {
                    System.out.println(i);
                }
                System.out.println("acabou!");
            }


    }

