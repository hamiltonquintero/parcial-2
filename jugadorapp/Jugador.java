package jugadorapp;

public class Jugador extends Persona {
    int numFed;

    public Jugador(String nombre, Fecha fechaNac, int numFed) {
        super(nombre, fechaNac);
        this.numFed = numFed;
    }
}