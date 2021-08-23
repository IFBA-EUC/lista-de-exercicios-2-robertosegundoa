import java.util.Scanner;
import java.lang.Math;

public class questa03 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in); 
        double x1, y1, x2, y2, distancia;
/*O erro da questão estava na calculo de divisão 1/2, pois, em java divisão de inteiros sempre gerem inteiros
   
*/
    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
    teclado.close();

    distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), (double)1/2);
    System.out.println("A distância é: " + distancia);

}

} 

