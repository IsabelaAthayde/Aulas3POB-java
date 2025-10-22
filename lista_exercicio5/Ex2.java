import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>(5);

		for(int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            String nome = sc.nextLine();
			nomes.add(nome);
        }
        
        System.out.print("Digite o nome de quem voce deseja excluir: ");
        String excluirNome = sc.nextLine();
        
        
        if(nomes.contains(excluirNome))
        {
            nomes.remove(excluirNome);
            
        }
        else
        {
            System.out.print("Nao possivel excluir! O nome "+ excluirNome +" nao esta listado.");
        }
        
	}
}