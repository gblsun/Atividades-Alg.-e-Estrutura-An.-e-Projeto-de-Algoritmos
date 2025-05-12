public class interativereversearray {

    // Reverte o array
    public static void reverseArray(int[] array) {
        int inicio = 0;                // Índice do início do array
        int fim = array.length - 1;   // Índice do fim do array

        // Enquanto o índice inicial for menor que o final
        while (inicio < fim) {
            // Troca os elementos nas posições start e end
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;

            // Move os índices em direção ao centro
            inicio++;
            fim--;
        }
    }

    // Método para imprimir o array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 5};

        System.out.println("Array original:");
        printArray(meuArray);

        reverseArray(meuArray);

        System.out.println("Array invertido:");
        printArray(meuArray);
    }
}