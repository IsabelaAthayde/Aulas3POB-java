import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(in.nextInt());
        }

        System.out.print("Digite um número para contar: ");
        int num = in.nextInt();

        int cont = 0;
        for (int n : numeros) {
            if (n == num) {
                cont++;
            }
        }

        System.out.println("O número " + num + " aparece " + cont + " vezes.");

        in.close();
    }
}
