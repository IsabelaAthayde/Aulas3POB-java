class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }
}

class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Paçoca", 3);
        Gato cat = new Gato("Biscoito", 2);

        System.out.print("Nome: " + dog.nome + ", Idade: " + dog.idade + " - ");
        dog.emitirSom();

        System.out.print("Nome: " + cat.nome + ", Idade: " + cat.idade + " - ");
        cat.emitirSom();
    }
}
