package controle;

import java.util.Scanner;
import dominio.ContaBancaria;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, saldo);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depositar: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para sacar: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
            } else if (opcao == 3) {
                conta.exibirSaldo();
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
