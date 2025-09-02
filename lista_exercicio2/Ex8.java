import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de disciplinas com média não alcançadas: ");
        
        int faltas = sc.nextInt();
        if (faltas == 0) {
            System.out.println("Aprovado");
        } else if (faltas <= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
