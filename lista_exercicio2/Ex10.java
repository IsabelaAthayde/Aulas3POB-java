import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        
        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next();
        
        int idade = 2025 - anoNascimento;
        
        if (sexo.equals("M") && idade == 18) {
            System.out.println("Serviço Militar Obrigatório");
        } else {
            System.out.println("Isento de Serviço Militar");
        }
    }
}
