package Jugadores.Jugadores.Jugador.infrastructure.DB;

import Jugadores.Jugadores.Jugador.domain.Condiciones;
import Jugadores.Jugadores.Jugador.domain.Jugador;
import Jugadores.Jugadores.Jugador.domain.JugadorRepository;
import Jugadores.Jugadores.JugadoresApplication;
import Jugadores.Jugadores.context.MySQLDBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JugadorRepositoryMySQL implements JugadorRepository {
    @Override
    public ArrayList<Jugador> getJugadores() {
        ArrayList<Jugador> lista = new ArrayList<>();
        try {
            ResultSet rs = MySQLDBConnection.getInstance().prepareStatement("SELECT * FROM Jugador").executeQuery();
            while (rs.next()){
                String dni = rs.getString("DNI");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");

                lista.add(new Jugador(dni,nombre,apellidos));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public Jugador getJugadorPorId(String id) {
        Jugador j = null;
        String query = "SELECT * FROM Jugador WHERE DNI = ? ";
        try {
            PreparedStatement ps = MySQLDBConnection.getInstance().prepareStatement(query);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String dni = rs.getString("DNI");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int resistencia = rs.getInt("resistencia");
                int velocidad = rs.getInt("velocidad");
                int recuperacion = rs.getInt("recuperacion");

                j = new Jugador(dni,nombre,apellidos,new Condiciones(resistencia,velocidad,recuperacion));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return j;
    }

    @Override
    public void addJugador(Jugador j) {

    }
}
