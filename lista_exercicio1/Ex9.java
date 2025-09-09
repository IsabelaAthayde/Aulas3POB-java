import java.util.Scanner;

/*
9. Conversão de Moeda
Leia um valor em reais (R$) e a cotação do dólar no dia.
Exiba o valor equivalente em dólares (US$).
*/

public class Ex9 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        double dolares = reais / cotacao;

        System.out.println("Valor em dólares (US$): " + dolares);
    }
}
