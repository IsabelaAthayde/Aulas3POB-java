import java.util.Scanner;

/*
2.Desenvolva um programa que leia o raio de um círculo e calcule sua área.
Fórmula: Área = π * raio²
Considere π = 3.14159.
*/

public class Ex2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do raio em cm: ");
        int raio = sc.nextInt();
        
        Double pi = 3.14159;
        Double area = pi * (raio * raio);
        
        System.out.print(area);
	}
}
