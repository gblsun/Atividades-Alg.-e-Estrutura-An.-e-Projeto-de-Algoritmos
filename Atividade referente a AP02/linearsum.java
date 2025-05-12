public class LinearSum {

    public static int somarNumeros(int[] numeros) {
        int soma = 0; // Começa a soma em zero

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        return soma;
    }

    public static void main(String[] args) {

        int[] lista = {3, 5, 7, 2, 8};

        int resultado = somarNumeros(lista);

        System.out.println("A soma dos números é: " + resultado);
    }
}
