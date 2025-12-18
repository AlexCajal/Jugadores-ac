package Jugadores.Jugadores.Jugador.domain;

import java.time.LocalDate;

public class Jugador {
    private String DNI;
    private String nombre;
    private String apellidos;

    private Condiciones condiciones;

    public Jugador(String DNI, String nombre, String apellidos, Condiciones condiciones) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.condiciones = condiciones;
    }
    public Jugador(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.condiciones = null;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Condiciones getCondiciones() {
        return condiciones;
    }
}
