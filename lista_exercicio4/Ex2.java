import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        Integer[] notas = new Integer[4];
        
        for(int i = 0; i < notas.length; i++) {
           System.out.print("Digite "+(i+1)+"º nota: ");
           
            notas[i] = sc.nextInt();
        }
        
        for(int i = 0; i < notas.length; i++) {
           sum+=notas[i];
        }
        int media = sum/notas.length;
        
        
        System.out.println("\nMedia das notas: "+ media);
        if(media>6)
        {
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }
}