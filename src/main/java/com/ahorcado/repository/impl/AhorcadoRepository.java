package com.ahorcado.repository.impl;

import com.ahorcado.repository.AhorcadoRepoI;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Repository
public class AhorcadoRepository implements AhorcadoRepoI {


    String palabra;
    int intentos=8;
    char[] letrasCorrectas;



    Boolean acierto=false;

    public AhorcadoRepository() {
    }

    private String elegirPalabra(){
        List<String> givenList = Arrays.asList("loro","avestruz","camarero","nubarron","hueco","indomable");
        Random rand = new Random();
        String randomElement = givenList.get(rand.nextInt(givenList.size()));
        return randomElement;
    }

    public void comprobarPalabra(String letra){
        char[] c_arr = letra.toCharArray();
        Boolean letraCorrecta=false;
        if (c_arr.length>1){
            if(String.valueOf(c_arr).equals(palabra)){
                acierto=true;
            }
        }
        else if(c_arr.length==1) {
            for(int i=0; i<letrasCorrectas.length;i++){
                if (palabra.charAt(i)==c_arr[0]){
                    letrasCorrectas[i]=palabra.charAt(i);
                    letraCorrecta=true;
                }

            }
            if(!letraCorrecta) {
                eliminarIntento();
            }
        }
    }

    public String guiones(){
        palabra=elegirPalabra();
        letrasCorrectas = new char [palabra.length()];
        for (int j=0;j<palabra.length();j++){
            letrasCorrectas[j]='_';
        }
        return String.valueOf(letrasCorrectas);
    }

    public void eliminarIntento(){
        intentos--;
    }

    public Boolean esAcierto() {
        return acierto;
    }

    public String getLetrasCorrectas() {
        return String.valueOf(letrasCorrectas);
    }

    public String getPalabra() {
        return palabra;
    }

    public int getIntentos() {
        return intentos;
    }
}
