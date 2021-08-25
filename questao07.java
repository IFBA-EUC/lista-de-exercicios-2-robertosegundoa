// o programa A é o correto;
// pode usar o traço de repetição WHILE, é uma forma mais simples. e também é possivel usar estrutura de decisao if, valor diferente de 1 ele apresenta o codigo, caso for -1 o programa fecha.


import java.util.Scanner;
public class questao07 {
    
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in); 
        int codigo; 
         
        System.out.println("Informe o código: "); 
        codigo = teclado.nextInt(); 
        while (codigo != -1) { 
            System.out.println("Código: " + codigo); 
            System.out.println("Informe o código: "); 
            codigo = teclado.nextInt();
        }*/

        Scanner teclado = new Scanner(System.in); 
        int codigo;  
        do { 
            System.out.print("Informe o código: "); 
            codigo = teclado.nextInt();
            if(codigo != -1){       //MANEIRA DE CORRIGIR O CÓDIGO
                System.out.println("Código: " + codigo); 
            }
            
        } while (codigo != -1);
        teclado.close();
    }

}
    

