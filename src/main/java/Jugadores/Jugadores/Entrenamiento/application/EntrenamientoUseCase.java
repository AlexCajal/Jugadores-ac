package Jugadores.Jugadores.Entrenamiento.application;

import Jugadores.Jugadores.Ejercicio.domain.EjercicioRepository;
import Jugadores.Jugadores.Entrenamiento.domain.EntrenamientoRepository;

public class EntrenamientoUseCase {
    private EntrenamientoRepository entrenamientoRepository;

    public EntrenamientoUseCase (EntrenamientoRepository entrenamientoRepository){
        this.entrenamientoRepository = entrenamientoRepository;
    }
}
