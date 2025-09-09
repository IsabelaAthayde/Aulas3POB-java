import java.util.Scanner;

/*
3.Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.
Fórmula: F = (C × 9/5) + 32.
*/

public class Ex3 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        Double C = sc.nextDouble();
        
        Double F = (C*9/5) + 32;
        
        System.out.println("Celsius: "+ C + " em Fahrenheit: " + F);
	}
}
