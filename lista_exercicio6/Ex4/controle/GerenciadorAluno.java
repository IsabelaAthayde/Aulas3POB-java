package controle;

import java.util.Scanner;
import dominio.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        double nota;
        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            nota = sc.nextDouble();
            Aluno a = new Aluno(nome, nota);
            if (a.validarNota()) {
                System.out.println("Aluno: " + nome);
                System.out.println("Situação: " + a.classificarAluno());
                break;
            } else {
                System.out.println("Nota inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
