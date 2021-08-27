import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String r = "";
        float C;
        double M = 0, s = 0;
        int i;


        System.out.print("Valor a ser investido: ");
        C = scan.nextFloat();
        System.out.print("Taxa de juros mensal: ");
        i = scan.nextInt();
        s = C;

        do{
            for(int a = 1; a <= 12; a++){
                s = s + ((s * i) / 100);
                M = M + s;
            }
            System.out.println("Saldo do investimento após 1 ano: " + M);
            System.out.println("Deseja processar mais um ano? (S/N)");
            r = scan.next();
            s = M;
        }while((r.equals("S")) || (r.equals("s")));
        scan.close();
    }
}