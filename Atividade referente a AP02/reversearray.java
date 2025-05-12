public class reversearray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original:");
        printArray(array);
        reverseArray(array);
        System.out.println("Array decrescente:");
        printArray(array);
    }
    // Invertera a lista para ordem decrescente
    public static void reverseArray(int[] arr) {
        int esquerda = 0;
        int direita = arr.length - 1;

        while (direita < esquerda) {
            // Troca os elementos nas posições esquerda e direita
            int temp = arr[esquerda];
            arr[esquerda] = arr[direita];
            arr[direita] = temp;

            // Move os ponteiros
            esquerda++;
            direita--;
        }
    }

    //Imprimir array em ordem decrescente
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}