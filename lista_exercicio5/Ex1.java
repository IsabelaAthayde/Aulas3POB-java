import java.util.Scanner;
import java.util.ArrayList;

class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> nums = new ArrayList<>();
		char parar = 'n';

		while(parar == 'n') {
			System.out.print("Digite um numero: ");
			int n=sc.nextInt();
			nums.add(n);

			System.out.print("\nDeseja parar de adicionar? [s/n]");
			parar = sc.next().charAt(0);
		}
		
		for(int i = 0; i < nums.size(); i++) {
           System.out.print(" "+nums.get(i));
        }
	}
}