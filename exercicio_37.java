import java.util.Scanner;

public class exercicio_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o salário atual: ");
        float salario = sc.nextFloat();
        sc.nextLine();

        System.out.print("Qual o seu gênero (M/F): ");
        String genero = sc.next().trim().toUpperCase();

        System.out.print("Há quantos anos você trabalha na empresa: ");
        int anos = sc.nextInt();

        if ("M".equals(genero)) {
            if (anos < 20) {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.03F));
            } else if (anos < 30) {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.13F));
            } else {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.25F));
            }
        } else if ("F".equals(genero)) {
            if (anos < 15) {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.05F));
            } else if (anos < 20) {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.12F));
            } else {
                System.out.println("Você tem um aumento de R$ " + (salario * 1.23F));
            }
        } else {
            System.out.println("Gênero inválido! Digite 'M' para masculino ou 'F' para feminino.");
        }

        sc.close();
    }
}
//salário, baseado na tabela a seguir:
//        • Mulheres
//        • menos de 15 anos de empresa: +5%
//        • de 15 até 20 anos de empresa: +12%
//        • mais de 20 anos de empresa: +23%
//• Homens
//        • menos de 20 anos de empresa: +3%
//        • de 20 até 30 anos de empresa: +13%
//        • mais de 30 anos de empresa: +25%
