package Jugadores.Jugadores.Jugador.domain;

public class Condiciones {
    private int resistencia;
    private int velocidad;
    private int recuperacion;

    public Condiciones(int resistencia, int velocidad, int recuperacion) {
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.recuperacion = recuperacion;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getRecuperacion() {
        return recuperacion;
    }
}
