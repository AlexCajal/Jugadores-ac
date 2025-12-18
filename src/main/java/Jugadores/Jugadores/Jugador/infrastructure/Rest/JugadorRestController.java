package Jugadores.Jugadores.Jugador.infrastructure.Rest;

import Jugadores.Jugadores.Jugador.application.JugadorUseCase;
import Jugadores.Jugadores.Jugador.domain.Jugador;
import Jugadores.Jugadores.Jugador.infrastructure.DB.JugadorRepositoryMySQL;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JugadorRestController {

    private JugadorUseCase jugadorUseCase;

    public JugadorRestController(){
        this.jugadorUseCase = new JugadorUseCase(new JugadorRepositoryMySQL());
    }

    @GetMapping("/api")
    public ArrayList<Jugador> listaJugadores(){
        return this.jugadorUseCase.getJugadores();
    }

    @GetMapping("/api/{id}")
    public Jugador listaJugadores(@PathVariable String id){
        return this.jugadorUseCase.getJugadorPorId(id);
    }

    @PostMapping("/api")
    public ArrayList<Jugador> addJugador(@RequestBody Jugador j){

        return this.jugadorUseCase.getJugadores();
    }
}
