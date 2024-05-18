package org.example.ItemsDefinidos;

import movimientos.Ataques;
import movimientos.Movimientos;
import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

import java.util.Random;


public class Tornado extends Items{

    public Tornado(String nombre) {
        super(nombre);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        Random random = new Random();
        int randomIntInRange = random.nextInt(5) + 1;
        jugador2.getListaMounstritos().SwapPoke(randomIntInRange);
    }
}
