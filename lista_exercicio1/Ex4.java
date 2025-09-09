import java.util.Scanner;

/*
4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.
*/

public class Ex4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1º nota: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Digite a 2º nota: ");
        float n2 = sc.nextFloat();
        
        System.out.print("Digite a 3º nota: ");
        float n3 = sc.nextFloat();
        
        float media = (n1+n2+n3)/3; 
        
        System.out.printf("Media aritmetica: %.2f", media);
	}
}
