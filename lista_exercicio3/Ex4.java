import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int qtd = sc.nextInt();
        
        Float n;
        Float sum = 0f;
        
        for(int i = 0;i < qtd;i++) {
            System.out.printf("\nDigite a nota do aluno %d: ", i+1);
            n = sc.nextFloat();
            
            sum+=n;
        }
        Float media = sum/qtd;
        
        System.out.printf("Media: %.2f", media);
    }
}