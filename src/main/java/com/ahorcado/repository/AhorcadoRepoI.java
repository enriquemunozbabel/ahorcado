package com.ahorcado.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public interface AhorcadoRepoI {

    public void comprobarPalabra(String letra);

    public String guiones();

    public void eliminarIntento();

    public Boolean esAcierto();

    public String getLetrasCorrectas();
    public String getPalabra();

    public int getIntentos();
}
