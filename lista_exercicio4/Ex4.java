import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int cont = 0;
        Integer[] nums = new Integer[8];
        
        for(int i = 0; i < nums.length; i++) {
           System.out.print("Digite "+(i+1)+"º num: ");
           
            nums[i] = sc.nextInt();
        }
        
        for(int i = 0; i < nums.length; i++) {
           
           if(nums[i]%2==0)
           {
                cont++;  
           }
        }
        
        System.out.println("quantidade de num pares: "+cont);
    }
}