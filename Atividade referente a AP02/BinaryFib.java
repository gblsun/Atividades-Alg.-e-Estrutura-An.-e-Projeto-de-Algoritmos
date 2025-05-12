public class BinaryFib {

    public static void main(String[] args) {
        int n = 10;  // Exemplo de número para Fibonacci
        String resultado = fibonacciBinario(n);
        System.out.println("Resultado binário da Fibonacci de " + n + ": " + resultado);
    }

    // Função principal que retorna o Fibonacci em formato binário
    public static String fibonacciBinario(int n) {
        int fib = calcularFibonacci(n);
        return Integer.toBinaryString(fib);
    }

    // Função recursiva para calcular o n-ésimo número de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
