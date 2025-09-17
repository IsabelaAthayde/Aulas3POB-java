import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int cont = 0;
        Integer[] nums = new Integer[10];
        
        for(int i = 0; i < nums.length; i++) {
           System.out.print("Digite "+(i+1)+"º num: ");
           
            nums[i] = sc.nextInt();
        }

        System.out.print("\nDigite um numero para buscar no array: ");
        int busca = sc.nextInt();
        
        for(int i = 0; i < nums.length; i++) {
           
           if(busca == nums[i])
           {
                System.out.print("\nNumero encontrado na posicao: "+i);
                return;
           }
        }
        
        System.out.println("Numero nao encontrado.");
    }
}