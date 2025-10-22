package controle;

import java.util.Scanner;
import dominio.CaixaEletronico;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico(saldo);

        int opcao;
        do {
            System.out.println("\n1 - Sacar");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para saque: ");
                    double valor = sc.nextDouble();
                    caixa.sacar(valor);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
