import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();
        
        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next();
        
        double desconto;
        
        if (sexo.equals("M")) {
            desconto = salario * 0.05;
        } else {
            desconto = salario * 0.03;
        }
        
        double salarioLiquido = salario - desconto;
        
        System.out.println(desconto);
        System.out.println(salarioLiquido);
    }
}
