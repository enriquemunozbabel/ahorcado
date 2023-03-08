package com.ahorcado.service;

public interface AhorcadoServiceI {

    public void comprobarPalabra(String letra);

    public String guiones();

    public void eliminarIntento();

    public Boolean esAcierto();

    public String getLetrasCorrectas();
    public String getPalabra();

    public int getIntentos();
}
