package Jugadores.Jugadores.Jugador.domain;

import java.time.LocalDate;

public class Jugador {
    private String DNI;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private Condiciones condiciones;

    public Jugador(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento, Condiciones condiciones) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.condiciones = condiciones;
    }
}
