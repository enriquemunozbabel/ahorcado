package com.ahorcado.infra.console;

import com.ahorcado.service.impl.AhorcadoService;

import javax.annotation.PostConstruct;
import java.util.Scanner;

public class ConsoleReader {

    public ConsoleReader(AhorcadoService ahorcadoService) {
        this.ahorcadoService = ahorcadoService;
    }

    AhorcadoService ahorcadoService;

    @PostConstruct
    public void Init(){
        Scanner sc = new Scanner(System.in);
        int opc=1;

        String entradaConsola;
        while (opc!=2){
            System.out.println("\nBienvenido a la ahorcado!");
            System.out.println("1- Jugar");
            System.out.println("2- Salir");
            System.out.println("\nSelecciona una opción:");
            entradaConsola=sc.next();
            try {
                opc=Integer.parseInt(entradaConsola);
            }
            catch (Exception e){
                System.out.println("Opción no válida, inserte un número");
            }

            switch (opc){
                case 2:
                    System.out.println("Hasta luego!");
                    break;
                case 1:
                    System.out.println(ahorcadoService.guiones());
                    while (ahorcadoService.getIntentos()>0 || ahorcadoService.esAcierto().equals(false)) {

                        System.out.println("Escriba una letra o palabra para jugar");
                        entradaConsola=sc.next();
                        ahorcadoService.comprobarPalabra(entradaConsola);
                        if(ahorcadoService.esAcierto()){
                            System.out.println("Enhorabuena has acertado!");
                            break;
                        }
                        else {
                            System.out.println("Sigue intentandolo, te quedan "+ahorcadoService.getIntentos()+" intentos.");
                        }
                        System.out.println(ahorcadoService.getLetrasCorrectas());
                    }
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        }
    }
}
