import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        
        do {
            System.out.println(n);
            n--;
        } while (n>=0);
        
    }
}