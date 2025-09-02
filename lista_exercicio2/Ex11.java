import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o 1º Numero: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o 2º Numero: ");
        int b = sc.nextInt();
        
        System.out.print("Digite o 3º Numero: ");
        int c = sc.nextInt();

        int maior = a;
        if (b > maior) { 
            maior = b;
        };

        if (c > maior) {
            maior = c;
        };

        if (maior < a + b + c - maior) {
            System.out.println("Forma triângulo");
        } else {
            System.out.println("Não forma triângulo");
        }
    }
}
