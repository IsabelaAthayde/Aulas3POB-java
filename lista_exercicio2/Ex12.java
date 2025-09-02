import java.util.Scanner;

public class Ex12 {
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
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não forma triângulo");
        }
    }
}
