class Veiculo {
    protected String marca;
    protected String modelo;
    protected String ano;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
    }
}

class Carro extends Veiculo {
    protected int qtdPortas;

    public Carro(String marca, String modelo, String ano, int qtdPortas) {
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("qtdPortas: " + this.qtdPortas);
    }
}

class Moto extends Veiculo {
    protected int cilindradas;
    
    public Moto(String marca, String modelo, String ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("cilindradas: " + this.cilindradas);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Toyota", "Corolla", "2022", 4);
        Moto m = new Moto("Honda", "CB 500", "2021", 500);

        System.out.println("=== Dados do Carro ===");
        c.exibirDados();

        System.out.println("\n=== Dados da Moto ===");
        m.exibirDados();
    }
}
