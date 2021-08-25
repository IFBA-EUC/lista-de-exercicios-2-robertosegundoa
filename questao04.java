import java.util.Scanner;

public class questao04 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n;
        float p;
        double v;
        int q;

        System.out.printf("Nome: ");
        n = scan.nextLine();
        System.out.printf("Preço: ");
        p = scan.nextFloat();
        System.out.println("Quantidade: ");
        q = scan.nextInt();

        if(q <= 10){
            v = p * q;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else if(q > 10 && q <= 20){
            v = (p * q) * 0.9;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else if(q > 20 && q <= 50){
            v = (p * q) * 0.8;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else{
            v = (p * q) * 0.75;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }
        scan.close();

    }

}
    

