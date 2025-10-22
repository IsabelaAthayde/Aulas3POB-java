import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String op = "s";

        while (op.equalsIgnoreCase("s")) {
            System.out.print("Digite um número: ");
            numeros.add(in.nextInt());
            System.out.print("Quer adicionar outro? (s/n): ");
            op = in.next();
        }

        Collections.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (int n : numeros) {
            System.out.println(n);
        }

        in.close();
    }
}
