import javax.swing.JOptionPane;
public class Exercicio62 {
    public static void main(String[] args) {
        double totalHomens = 0.0;
        double totalMulheres = 0.0;
        String continuar = "s";  // Variável para controlar o loop

        while (continuar.equalsIgnoreCase("s")) {
            // Leitura do salário e sexo
            String salarioStr = JOptionPane.showInputDialog(null, "Digite o salário do funcionário: R$ ");
            double salario = Double.parseDouble(salarioStr);

            String sexo = JOptionPane.showInputDialog(null, "Digite o sexo do funcionário (M/F): ");

            // Verifica o sexo e adiciona o salário no total correspondente
            if (sexo.equalsIgnoreCase("M")) {
                totalHomens += salario;
            } else if (sexo.equalsIgnoreCase("F")) {
                totalMulheres += salario;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Digite M para Masculino ou F para Feminino.");
            }

            // Pergunta se o usuário quer continuar
            continuar = JOptionPane.showInputDialog(null, "Deseja continuar? (s/n): ");
        }

        // Exibe o resultado final
        JOptionPane.showMessageDialog(null, "Total de salários pagos aos homens: R$ " + totalHomens);
        JOptionPane.showMessageDialog(null, "Total de salários pagos às mulheres: R$ " + totalMulheres);
    }
}
