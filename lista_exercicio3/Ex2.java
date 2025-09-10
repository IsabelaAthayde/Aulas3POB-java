import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        
        int multi = 1;
        while (multi < 11) {
            System.out.printf("%d x %d = %d\n", n, multi, n*multi);
            multi++;
        }
        
    }
}