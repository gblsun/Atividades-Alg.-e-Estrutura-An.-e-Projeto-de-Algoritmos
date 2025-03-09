import javax.swing.*;

public class exercicio_47 {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 500; i >= 0; i -= 50 ) {

            soma += i;
        }
        JOptionPane.showMessageDialog(null, "O resultado é: "
                + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);}

    }


//• Desenvolva um aplicativo que mostre na tela o resultado da
//expressão 500 +
//        450 + 400 + 350 + 300 + ... + 50 + 0
