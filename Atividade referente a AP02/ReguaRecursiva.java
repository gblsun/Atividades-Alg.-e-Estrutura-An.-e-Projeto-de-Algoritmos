public class ReguaRecursiva {

    public static void main(String[] args) {
        regua(2);  
    }

    // Função que desenha a régua principal
    public static void regua(int n) {
        System.out.print("|");  
        for (int i = 1; i <= n; i++) {
            desenharRegua(n);
            System.out.print("|");
        }
        System.out.println(); 

    // Função recursiva que desenha as divisões intermediárias
    public static void desenharRegua(int centro) {
        if (centro > 0) {
            desenharRegua(centro - 1);
            System.out.println("-".repeat(centro));  
            desenharRegua(centro - 1);
        }
    }
}