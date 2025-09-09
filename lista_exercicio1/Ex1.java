import java.util.Scanner;

/*
1. Soma de Dois Números
Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.
*/
public class Ex1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números é: " + soma);
    }
}