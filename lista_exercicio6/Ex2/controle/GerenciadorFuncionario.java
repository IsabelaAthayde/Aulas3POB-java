package controle;

import java.util.Scanner;
import dominio.Funcionario;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a categoria (A, B ou C): ");
        String categoria = sc.nextLine();

        Funcionario f = new Funcionario(nome, salarioBase, categoria);

        System.out.println("Salário final: " + f.calcularSalarioFinal());

        sc.close();
    }
}
