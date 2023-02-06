package Clases;

public class Participante {
    public int victorias;
    public int derrotas;
    public int partidas;
    public String nombre;

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main (String [] args){
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
    }
}
