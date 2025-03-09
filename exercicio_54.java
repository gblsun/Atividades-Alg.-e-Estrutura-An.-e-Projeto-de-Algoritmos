import javax.swing.*;

public class exercicio_54 {
    public static void main(String[] args) {
        float totalAltura = 0;
        int mais90Kg = 0;
        int menos50KgMenos160m = 0;
        int mais190mMais100Kg = 0;

        for (int i = 1; i <= 7; i++) {
            String pesoStr = JOptionPane.showInputDialog("Digite o peso (em kg) da pessoa " + i + ": ");
            float peso = Float.parseFloat(pesoStr);

            String alturaStr = JOptionPane.showInputDialog("Digite a altura (em metros) da pessoa " + i + ": ");
            float altura = Float.parseFloat(alturaStr);

            totalAltura += altura;

            if (peso > 90) {
                mais90Kg++;
            }

            if (peso < 50 && altura < 1.60) {
                menos50KgMenos160m++;
            }

            if (altura > 1.90 && peso > 100) {
                mais190mMais100Kg++;
            }
        }

        float mediaAltura = totalAltura / 7.0f;

        JOptionPane.showMessageDialog(null, "Média de altura do grupo: " + mediaAltura);
        JOptionPane.showMessageDialog(null, "Pessoas que pesam mais de 90kg: " + mais90Kg);
        JOptionPane.showMessageDialog(null, "Pessoas com menos de 50kg e altura abaixo de 1.60m: " + menos50KgMenos160m);
        JOptionPane.showMessageDialog(null, "Pessoas que medem mais de 1.90m e pesam mais de 100kg: " + mais190mMais100Kg);
    }
}

//• Desenvolva um aplicativo que leia o peso e a altura de 7
//pessoas, mostrando no final:
//• Qual foi a média de altura do grupo
//• Quantas pessoas pesam mais de 90Kg
//• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//• Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg
