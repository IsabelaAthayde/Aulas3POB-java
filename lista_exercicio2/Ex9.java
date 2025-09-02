import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o 1º nota: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o 2º nota: ");
        int n2 = sc.nextInt();
        
        int media = (n1 + n2) / 2;
        if (media >= 7) {
            System.out.println(media);
            System.out.println("Aprovado");
        } else {
            System.out.print("Digite a 3º nota: ");
            int n3 = sc.nextInt();
            
            int novaMedia = (n1 + n2 + n3 * 2) / 4;
            
            System.out.println(novaMedia);
            if (novaMedia >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
