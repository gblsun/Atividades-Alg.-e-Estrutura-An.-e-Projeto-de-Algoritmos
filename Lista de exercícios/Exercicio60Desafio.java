/*
1° Importei a biblioteca JOptionPane
2° Gerei um número aleatório entre 1 e 10
3° Defini o número de tentativas e a variável de controle
4° Usei um loop para permitir 4 tentativas ao jogador
5° Solicitei e converti o palpite do jogador
6° Verifiquei se o palpite está correto, maior ou menor que o número sorteado
7° Exibi mensagens informando o resultado de cada tentativa
8° Caso o jogador não acerte, exibi a resposta correta
 */
import javax.swing.JOptionPane;
public class Exercicio60Desafio {
    public static void main(String[] args) {
        // Gera um número aleatório entre 1 e 10
        int numeroSorteado = (int) (Math.random() * 10) + 1;
        int tentativas = 4;
        boolean acertou = false;

        // Loop para dar ao jogador 4 tentativas
        for (int i = 1; i <= tentativas; i++) {
            String palpiteStr = JOptionPane.showInputDialog(null, "Tentativa " + i + " de " + tentativas + "\nTente adivinhar o número entre 1 e 10:");
            int palpite = Integer.parseInt(palpiteStr);

            // Verifica se o palpite está correto
            if (palpite == numeroSorteado) {
                acertou = true;
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroSorteado + "!");
                break;
            } else if (palpite < numeroSorteado) {
                JOptionPane.showMessageDialog(null, "O número sorteado é maior. Tente novamente.");
            } else {
                JOptionPane.showMessageDialog(null, "O número sorteado é menor. Tente novamente.");
            }
        }

        // Se o jogador não acertou, mostra a resposta correta
        if (!acertou) {
            JOptionPane.showMessageDialog(null, "Você não acertou o número. O número sorteado era " + numeroSorteado + ".");
        }

    }
}
