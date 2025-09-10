import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero (inicio): ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero (fim): ");
        int n2 = sc.nextInt();
        
        int cont = 0;
        if(n1 == 1) {
            System.out.println(n1);
            n1++;
        }
        
        for(int i=n1; i<=n2 ;i++) {
            for(int j=n1; j<=n2 ;j++) {
                if(i%j == 0) 
                    cont++;
                
            }
            
            if(cont == 1) 
                System.out.println(i);
            
            cont=0;
        }
    }
}