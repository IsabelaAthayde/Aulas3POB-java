import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] nums = new Integer[6];
        
        for(int i = 0; i < 6; i++) {
           System.out.print("Digite "+(i+1)+"º numero: ");
           
            nums[i] = sc.nextInt();
        }
        
        for(int i = nums.length-1; i >=0; i--) {
           System.out.print(" "+ nums[i]);
        }

    }
}