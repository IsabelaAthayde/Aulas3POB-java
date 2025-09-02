import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua Idade: ");
        
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
    }
}
