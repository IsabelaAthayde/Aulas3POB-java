import java.util.Scanner;

/*
8. Cálculo do Volume de uma Esfera
Fórmula: V = (4/3) * π * raio³
π = 3.14159
*/

public class Ex8 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.println("O volume da esfera é: " + volume);
    }
}
