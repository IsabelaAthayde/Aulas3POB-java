package dominio;

public class Funcionario {
    String nome;
    double salarioBase;
    String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {
        double salarioFinal = salarioBase;
        switch (categoria) {
            case "A":
                salarioFinal += salarioBase * 0.2;
                break;
            case "B":
                salarioFinal += salarioBase * 0.1;
                break;
            case "C":
                break;
            default:
                System.out.println("Categoria inválida!");
        }
        return salarioFinal;
    }
}
