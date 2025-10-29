class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.05;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario("Carlos", 3000);
        Gerente ger = new Gerente("Luana", 5000);
        Estagiario est = new Estagiario("Miguel", 1500);

        System.out.println(fun.nome + " - Salário: R$ " + fun.calcularSalario());
        System.out.println(ger.nome + " - Salário: R$ " + ger.calcularSalario());
        System.out.println(est.nome + " - Salário: R$ " + est.calcularSalario());
    }
}

