import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Digite números (digite -1 para parar):");

        double num = 0;
        while (num != -1) {
            num = sc.nextDouble();
            if (num != -1) {
                numeros.add(num);
            }
        }

        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }

        double media = 0;
        if (numeros.size() > 0) {
            media = soma / numeros.size();
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}
