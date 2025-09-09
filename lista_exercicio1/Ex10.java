import java.util.Scanner;

/*
10. Distância Entre Dois Pontos
Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)
*/

public class Ex10 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distancia = Math.sqrt((dx * dx) + (dy * dy));

        System.out.println("A distância entre os pontos é: " + distancia);
    }
}
