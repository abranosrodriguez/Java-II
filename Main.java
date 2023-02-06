import Clases.Participante;

import static Clases.Maquina.aleatorio;
import static Clases.Usuario.aleatorio_cadena;

public class Main {
    public static void main(String[] args) {
        int res = aleatorio();
        System.out.println("El numero escogido es el: "+res);

        Participante participante1 = new Participante();
        participante1.victorias = 3;
        participante1.derrotas = 2;
        participante1.partidas = participante1.victorias + participante1.derrotas;
        participante1.nombre = "Pepe";
        System.out.println("Nombre del Jugador: "+participante1.nombre + "\nVictorias: "+participante1.victorias +"\nDerrotas: "+participante1.derrotas+"\nJugadas: "+participante1.partidas);

        Participante participante2 = new Participante();
        System.out.println("Nombre del Jugador: "+participante2.nombre);
        System.out.println("Victorias: "+participante2.victorias);
        System.out.println("Derrotas: "+participante2.derrotas);
        System.out.println("Jugadas: "+participante2.partidas);

        String valor = aleatorio_cadena();
        System.out.println("Escogiste: "+valor);
    }
}