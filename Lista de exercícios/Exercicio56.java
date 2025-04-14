import javax.swing.*;

public class Exercicio56 {
    public static void main(String[] args) {
        float totalHomens = 0;
        float totalMulheres = 0;

        while (true) {
            String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário: ");
            float salario = Float.parseFloat(salarioStr);

            String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário (M para masculino, F para feminino): ");

            if (sexo.equalsIgnoreCase("M")) {
                totalHomens += salario;
            } else if (sexo.equalsIgnoreCase("F")) {
                totalMulheres += salario;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.");
                continue;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro funcionário?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de salários pagos aos homens: R$ " + totalHomens);
        JOptionPane.showMessageDialog(null, "Total de salários pagos às mulheres: R$ " + totalMulheres);
    }
}

//Desenvolva um aplicativo que leia o salário e o sexo de vários
//funcionários. No final, mostre o total de salários pagos aos homens
//e o total pago às mulheres. O programa vai perguntar ao usuário se
//ele quer continuar ou não sempre que ler os dados de um
//funcionário.

