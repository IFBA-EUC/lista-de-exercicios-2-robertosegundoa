import java.util.Scanner;



public class questao06 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b = 10, c, d = 0;


        System.out.println("Coloque um número: ");
        a = scan.nextInt();

        do{
            c = a / b;
            d++;
            b = b * 10;
        }while(c >= 1);
        System.out.printf("Foi coloado %d dígito(s)", d);
        scan.close();
    }

}
