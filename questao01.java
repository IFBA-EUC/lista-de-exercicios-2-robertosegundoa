import java.lang.Math;
import java.util.Scanner;

public class questao01 {

    public static void main(String[] args){

        double delt, valor1, valor2, a, b, c;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor de a: ");
        a = leitor.nextDouble();
        System.out.println("Valor de b: ");
        b = leitor.nextDouble();
        System.out.println("Valor de c: ");
        c = leitor.nextDouble();

        delt = Math.pow(b, 2)-4*a*c;
        
        if(delt >= 0){
            valor1 = (-b + Math.sqrt(delt))/2*a;
            valor2 = (-b - Math.sqrt(delt))/2*a;
            System.out.printf("Raiz 1= %.1f \n", valor1);
            System.out.printf("Raiz 2= %.1f \n", valor2);
        }else{
            System.out.println("Sem raiz!");
        }
    }
}