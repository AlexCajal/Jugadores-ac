package Jugadores.Jugadores.Ejercicio.application;

import Jugadores.Jugadores.Ejercicio.domain.Ejercicio;
import Jugadores.Jugadores.Ejercicio.domain.EjercicioRepository;

import java.util.List;

public class EjercicioUseCase {
    private EjercicioRepository ejercicioRepository;

    public EjercicioUseCase (EjercicioRepository ejercicioRepository){
        this.ejercicioRepository = ejercicioRepository;
    }

}
