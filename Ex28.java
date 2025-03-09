import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args){
        Scanner terrain = new Scanner(System.in);
        System.out.println("Informe a largura do terreno: ");
        int width = terrain.nextInt();
        System.out.println("Informe o comprimento do terreno: ");
        int length = terrain.nextInt();

        int area = width * length;

        if (area <= 100){
            System.out.println("Terreno Popular");
        } else if(area > 100 && area<= 500 ){
            System.out.println("Terreno Master");
        } else {
            System.out.println("Terreno Vip");
        }
    }
}
