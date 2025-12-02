package Jugadores.Jugadores.Jugador.application;

import Jugadores.Jugadores.Entrenamiento.domain.EntrenamientoRepository;
import Jugadores.Jugadores.Jugador.domain.Jugador;
import Jugadores.Jugadores.Jugador.domain.JugadorRepository;

import java.util.ArrayList;

public class JugadorUseCase {
    private JugadorRepository jugadorRepository;

    public JugadorUseCase (JugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }
    public ArrayList<Jugador> getJugadores(){
        ArrayList<Jugador> lista = new ArrayList<Jugador>();

    }
}
