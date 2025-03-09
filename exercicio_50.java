import java.util.Random;

public class exercicio_50 {

    public static void main(String[] args) {
        Random random = new Random();
        int conta = 0;
        int divide = 0;
        System.out.print("Números sorteados: ");
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(11);
            System.out.print(num + " ");
            if (num > 5) conta++;
            if (num > 0 && num % 3 == 0) divide++;
        }

        System.out.println(" \n números maior que 5: " + conta);
        System.out.println(("numero divisiveio por 3: " + divide));
    }
}
