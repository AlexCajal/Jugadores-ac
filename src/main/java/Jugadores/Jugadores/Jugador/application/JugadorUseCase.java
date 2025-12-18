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
        return this.jugadorRepository.getJugadores();
    }
    public Jugador getJugadorPorId(String id){
        return this.jugadorRepository.getJugadorPorId(id);
    }
    public void addJugador(Jugador j){
        this.jugadorRepository.addJugador(j);
    }
}
