import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor=100;
        int maior=-1;
        Integer[] nums = new Integer[5];
        
        for(int i = 0; i < 5; i++) {
           System.out.print("Digite "+(i+1)+"º numero: ");
           
            nums[i] = sc.nextInt();
            
        }
        
        for(int i = 0; i < 5; i++) {
          if(nums[i] < menor)
            {
                menor=nums[i];
            }
            
            if(nums[i] > maior)
            {
                maior=nums[i];
            }
        }
        
        
        System.out.println("\nMenor valor: "+ menor);
        System.out.println("Maior valor: "+ maior);
    }
}