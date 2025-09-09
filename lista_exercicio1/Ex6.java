import java.util.Scanner;

/*
6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e
o valor de desconto do INSS. O programa deve calcular
e exibir o salário líquido.
*/

public class Ex6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        float bruto = sc.nextFloat();
        
        System.out.print("Digite o desconto: ");
        float desconto = sc.nextFloat();
        
        float liquido = bruto - desconto;
        
        System.out.println("salário líquido: " + liquido);
	}
}