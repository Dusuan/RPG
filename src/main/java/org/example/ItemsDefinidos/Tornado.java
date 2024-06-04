package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;

import java.util.Random;

import static org.example.Duelo.registrarLog;


public class Tornado extends Items{

    public Tornado(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        String LOGMESSAGE = "";
        if(usado){
            System.out.println("Esta habilidad ya ha sido usada");
        }else{
        Random random = new Random();
        int randomIntInRange = random.nextInt(3) + 1;
        jugador2.getListaMounstritos().SwapPoke(randomIntInRange);

        LOGMESSAGE = "El jugador "+jugadorAfectado.getNombre()+ " ha cambiado el orden de los mounstros del jugador "+jugador2.getNombre() +"!";
        registrarLog(LOGMESSAGE);

            usado = true;}
    }
}
