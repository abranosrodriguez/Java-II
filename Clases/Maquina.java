package Clases;

public class Maquina extends Participante{
    public static void main (String [] args){
        int res = aleatorio();
        System.out.println("El numero escogido es el: "+res);
    }
    public static int aleatorio(){
        int numero = (int)(Math.random()*10+1);
        if (numero % 2 == 0){
            int azar = 0;
            return azar;
        }else{
            int azar = 1;
            return azar;
        }

    }
}
