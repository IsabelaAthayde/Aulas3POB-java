import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1º Numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o 2º Numero: ");
        int n2 = sc.nextInt();
        
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}
