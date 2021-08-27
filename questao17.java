import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, x1, x2, x3;
        int y1, y2, y3;
        int a1;

        System.out.print("Digite um número decimal de até 3 digitos: ");
        x = scan.nextInt();

        y1 = x/100;    
        a1 = x % 100;
        y2 = a1 / 10;   
        y3 = a1 % 10;   

       
        x1 = y1 * 100;  
        x2 = y2 * 10;   
        x3 = y3;        

        

        String [] cent;         
        cent = new String[9];   
        cent[0] = "C";      //100
        cent[1] = "CC";     //200
        cent[2] = "CCC";    //300
        cent[3] = "CD";     //400
        cent[4] = "C";      //500
        cent[5] = "DC";     //600
        cent[6] = "DCC";    //700
        cent[7] = "DCCC";   //800
        cent[8] = "CM";     //900

        

        String [] dez;
        dez = new String[9];
        dez[0] = "X";       //10
        dez[1] = "XX";      //20
        dez[2] = "XXX";     //30
        dez[3] = "XL";      //40
        dez[4] = "L";       //50
        dez[5] = "LX";      //60
        dez[6] = "LXX";     //70
        dez[7] = "LXXX";    //80
        dez[8] = "XC";      //90

        

        String [] uni;
        uni = new String[9];
        uni[0] = "I";       //1
        uni[1] = "II";      //2
        uni[2] = "III";     //3
        uni[3] = "IV";      //4
        uni[4] = "V";       //5
        uni[5] = "VI";      //6
        uni[6] = "VII";     //7
        uni[7] = "VIII";    //8
        uni[8] = "IX";      //9

        //MOSTRAR CENTENAS EM N ROMANO:
        String cr = " ";     

        switch (x1) {       
            case 100:        //SE A CENTENA DO NÚMERO FOR IGUAL A 100, cr será igual a C
                cr = cent[0];
                break;
            case 200:
                cr = cent[1];
                break;
            case 300:
                cr = cent[2];
                break;
            case 400:
                cr = cent[3];
                break;
            case 500:
                cr = cent[4];
                break;
            case 600:
                cr = cent[5];
                break;
            case 700:
                cr = cent[6];
                break;
            case 800:
                cr = cent[7];
                break;
            case 900:
                cr = cent[8];
                break;
        }

        String dr = " ";     //recebe o valor da dezena em n romano

        switch (x2) {
            case 10:
                dr = dez[0];
                break;
            case 20:
                dr = dez[1];
                break;
            case 30:
                dr = dez[2];
                break;
            case 40:
                dr = dez[3];
                break;
            case 50:
                dr = dez[4];
                break;
            case 60:
                dr = dez[5];
                break;
            case 70:
                dr = dez[6];
                break;
            case 80:
                dr = dez[7];
                break;
            case 90:
                dr = dez[8];
                break;
        }

        String ur = " ";     //recebe o valor da unidade em n romano

        switch (x3) {
            case 1:
                ur = uni[0];
                break;
            case 2:
                ur = uni[1];
                break;
            case 3:
                ur = uni[2];
                break;
            case 4:
                ur = uni[3];
                break;
            case 5:
                ur = uni[4];
                break;
            case 6:
                ur = uni[5];
                break;
            case 7:
                ur = uni[6];
                break;
            case 8:
                ur = uni[7];
                break;
            case 9:
                ur = uni[8];
                break;
        }

        if(x < 10){
            System.out.println(ur);
        }else if(x < 100 && x > 9){
            System.out.println( dr + ur);
        }else{
            System.out.println(cr + dr + ur);
        }

        

        scan.close();
    }
}

    
