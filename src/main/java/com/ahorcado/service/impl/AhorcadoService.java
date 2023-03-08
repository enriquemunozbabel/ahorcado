package com.ahorcado.service.impl;

import com.ahorcado.repository.impl.AhorcadoRepository;
import com.ahorcado.service.AhorcadoServiceI;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class AhorcadoService implements AhorcadoServiceI {
    private AhorcadoRepository ahorcadoRepository;

    public AhorcadoService(AhorcadoRepository ahorcadoRepository) {
        this.ahorcadoRepository = ahorcadoRepository;
    }

    @Override
    public void comprobarPalabra(String letra) {
        ahorcadoRepository.comprobarPalabra(letra);
    }

    @Override
    public String guiones() {
        return ahorcadoRepository.guiones();
    }

    @Override
    public void eliminarIntento() {
        ahorcadoRepository.eliminarIntento();
    }

    @Override
    public Boolean esAcierto() {
        return ahorcadoRepository.esAcierto();
    }

    @Override
    public String getLetrasCorrectas() {
        return ahorcadoRepository.getLetrasCorrectas();
    }

    @Override
    public String getPalabra() {
        return ahorcadoRepository.getPalabra();
    }

    @Override
    public int getIntentos() {
        return ahorcadoRepository.getIntentos();
    }


}
