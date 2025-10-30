package jugadorapp;

public class MainJugador {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(11, 10, 2000);
        Jugador jugador = new Jugador("Carlos Roca", fecha, 12345);

        System.out.println("Nombre del jugador: " + jugador.nombre);
        System.out.println("Número de federación: " + jugador.numFed);
        System.out.println("Fecha de nacimiento: " + fecha.dia + "/" + fecha.mes + "/" + fecha.anio);
    }
}