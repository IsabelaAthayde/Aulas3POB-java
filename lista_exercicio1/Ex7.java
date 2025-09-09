import java.util.Scanner;

/*
7. Cálculo do Perímetro e Área de um Retângulo
Área = base × altura
Perímetro = 2 × (base + altura)
*/

public class Ex7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
