import javax.swing.JOptionPane;
public class Exercicio59 {
    public static void main(String[] args) {
        int pessoasMaisDe90Kg = 0;
        int pessoasMenosDe50KgMenosDe160m = 0;
        int pessoasMaisDe190mMaisDe100Kg = 0;
        double somaAlturas = 0;
        int totalPessoas = 7;

        // Laço para ler as informações de 7 pessoas
        for (int i = 1; i <= totalPessoas; i++) {
            String pesoStr = JOptionPane.showInputDialog(null, "Pessoa " + i + "\nDigite o peso (kg):");
            double peso = Double.parseDouble(pesoStr);

            String alturaStr = JOptionPane.showInputDialog(null, "Pessoa " + i + "\nDigite a altura (m):");
            double altura = Double.parseDouble(alturaStr);

            // Soma a altura para calcular a média
            somaAlturas += altura;

            // Verifica quantas pessoas pesam mais de 90kg
            if (peso > 90) {
                pessoasMaisDe90Kg++;
            }

            // Verifica quantas pessoas pesam menos de 50kg e tem menos de 1.60m
            if (peso < 50 && altura < 1.60) {
                pessoasMenosDe50KgMenosDe160m++;
            }

            // Verifica quantas pessoas medem mais de 1.90m e pesam mais de 100kg
            if (altura > 1.90 && peso > 100) {
                pessoasMaisDe190mMaisDe100Kg++;
            }
        }

        // Calcula a média de altura do grupo
        double mediaAltura = somaAlturas / totalPessoas;

        // Exibe os resultados
        String resultado = "Média de altura do grupo: " + mediaAltura + "m\n";
        resultado += "Pessoas que pesam mais de 90kg: " + pessoasMaisDe90Kg + "\n";
        resultado += "Pessoas com menos de 50kg e altura menor que 1.60m: " + pessoasMenosDe50KgMenosDe160m + "\n";
        resultado += "Pessoas com mais de 1.90m e mais de 100kg: " + pessoasMaisDe190mMaisDe100Kg;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
