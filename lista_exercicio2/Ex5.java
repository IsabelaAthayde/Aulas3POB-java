import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu Ano de Nascimento (Ex:1999): ");
        int anoNascimento = sc.nextInt();
        
        int idade = 2025 - anoNascimento;
        
        if (idade >= 16) {
            System.out.println("Apto a ser eleitor");
        } else {
            System.out.println("Inapto a ser eleitor");
        }
    }
}
