import java.util.Scanner;

public class questao02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d, na, ba, xa, nb, bb, xb;

        System.out.println("Coloque as coordenadas do Ponto A: ");
        System.out.println("Xa: ");
        na = scan.nextDouble();
        System.out.println("Ya: ");
        ba = scan.nextDouble();
        System.out.println("Za: ");
        xa = scan.nextDouble();

        System.out.println("Coloque as coordenadas do Ponto B: ");
        System.out.println("Xb: ");
        nb = scan.nextDouble();
        System.out.println("Yb: ");
        bb = scan.nextDouble();
        System.out.println("Zb: ");
        xb = scan.nextDouble();

        d = Math.sqrt(Math.pow((nb - na), 2) + Math.pow((bb - ba), 2) + Math.pow((xb - xa), 2));   //raiz quadrada de ((nb - na)**2 + (bb - ba)**2 + (xb - xa)**2)
        System.out.printf("A distância entre os pontos é: %f", d);
        scan.close();
    }

}

    

