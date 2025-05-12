public class BinarySum {

    public static String binarySum(String bin1, String bin2) {
        // Converte as strings binárias em números inteiros
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // Soma os números inteiros
        int sum = num1 + num2;

        // Converte a soma de volta para binário e retorna como string
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        String bin1 = "1010"; // Exemplo de binário
        String bin2 = "1101"; // Exemplo de binário

        String result = binarySum(bin1, bin2);
        System.out.println("Soma binária: " + result); // Resultado da soma binária
    }
}
