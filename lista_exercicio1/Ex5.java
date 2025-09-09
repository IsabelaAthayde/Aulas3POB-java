import java.util.Scanner;

/*
5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos 
e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias.
*/

public class Ex5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        int diasVividos = idade*365;
        
        System.out.println("Quantidade aproximada de dias vividos: " + diasVividos);
	}
}
