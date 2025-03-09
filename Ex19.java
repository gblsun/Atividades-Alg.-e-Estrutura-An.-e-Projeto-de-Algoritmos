import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
        System.out.println("Qual é o seu nome?: ");
        String nome = media.next();
        System.out.println("Informe sua primeira nota: ");
        Double nota1 = media.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        Double nota2 = media.nextDouble();

        double aproveitamento = (nota1 + nota2) / 2;

        if(aproveitamento > 7) {
            System.out.println(nome + " meus parabêns você teve um ótimo desmpenho teve uma nota de: " + aproveitamento);
        } else {
            System.out.println(nome + " infelizmente você não teve um bom desempenho tirou uma nota de: " + aproveitamento + " . Estude mais.");
        }
    }
}
