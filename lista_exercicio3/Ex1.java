import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
           sum+=i;
        }
        
        System.out.println("Soma de 1 até n: "+ sum);
    }
}