public class InterativeReverseArray {

    public static void reverseArray(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        
        while (inicio < fim) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 5};

        System.out.println("Array original:");
        printArray(meuArray);

        reverseArray(meuArray);

        System.out.println("Array invertido:");
        printArray(meuArray);
    }
}
