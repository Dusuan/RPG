package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;

import java.util.Random;


public class Tornado extends Items{

    public Tornado(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        if(usado){
            System.out.println("Esta habilidad ya ha sido usada");
        }else{
        Random random = new Random();
        int randomIntInRange = random.nextInt(5) + 1;
        jugador2.getListaMounstritos().SwapPoke(randomIntInRange);
        usado = true;}
    }
}
