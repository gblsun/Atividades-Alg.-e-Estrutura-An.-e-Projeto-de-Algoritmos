import javax.swing.*;

public class Exercicio51 {
    public static void main(String[] args) {
        float preco;


        String input = JOptionPane.showInputDialog("Digite o preço:");
        preco = Float.parseFloat(input);
        float maiorValor = preco;
        float menorValor = preco;


        for (int i = 2; i <= 8; i++) {
            input = JOptionPane.showInputDialog("Digite o preço:");
            preco = Float.parseFloat(input);


            if (preco > maiorValor) {
                maiorValor = preco;
            }
            if (preco < menorValor) {
                menorValor = preco;
            }
        }


        JOptionPane.showMessageDialog(null, "O maior valor digitado foi: R$ " + maiorValor);
        JOptionPane.showMessageDialog(null, "O menor valor digitado foi: R$ " + menorValor);
    }
}












