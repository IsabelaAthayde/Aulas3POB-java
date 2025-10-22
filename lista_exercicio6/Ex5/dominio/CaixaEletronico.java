package dominio;

public class CaixaEletronico {
    double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor % 10 != 0) {
            System.out.println("Valor inválido! Apenas múltiplos de 10.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
