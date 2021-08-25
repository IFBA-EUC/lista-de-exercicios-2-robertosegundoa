import java.util.Scanner;

public class questao08 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, F0 = 0, F1 = 1, Fn = 0;

        System.out.printf("Coloque um número não negativo: ");
        n = scan.nextInt();
        
        if(n < 0){
            System.out.println("ERRO! Número Inválido!");
        }else{
            System.out.printf("0 1 ");
            for(int i = 1; i < n; i++){
                Fn = F1 + F0;
                System.out.printf("%d ", Fn);
                F0 = F1;
                F1 = Fn;
            }
        }
        scan.close();

    }

}
    
