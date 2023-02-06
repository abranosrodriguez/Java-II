package Clases;

import java.util.Scanner;

public class Usuario extends Participante{
    public static void main(String[] args){
        String valor = aleatorio_cadena();
        System.out.println("Escogiste: "+valor);
    }
    public static String aleatorio_cadena(){
        String x;
        int y;
        Scanner valor_pedido = new Scanner(System.in);
        System.out.print("Cara o Cruz");
        x = valor_pedido.next();

        if(x.equals("Cara") || x.equals("cara")){
            System.out.println("Escogiste Cara");
            y = 0;
            return String.valueOf(y);
        }else if (x.equals("Cruz") || x.equals("cruz")){
            System.out.println("Escogiste Cruz");
            y = 1;
            return String.valueOf(y);
        }
        return x;
    }
}
