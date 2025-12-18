package Jugadores.Jugadores.Jugador.domain;

import java.util.ArrayList;

public interface JugadorRepository {

    public ArrayList<Jugador> getJugadores();
    public Jugador getJugadorPorId(String id);
    public void addJugador(Jugador j);
}
