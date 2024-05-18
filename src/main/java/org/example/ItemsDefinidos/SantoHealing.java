package org.example.ItemsDefinidos;

import movimientos.Ataques;
import movimientos.Movimientos;
import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class SantoHealing extends Items {
    public SantoHealing(String nombre) {
        super(nombre);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        try {
            for (int i = 0; i < jugadorAfectado.getListaMounstritos().size(); i++) {
                Mounstritos actual = jugadorAfectado.getListaMounstritos().obtener(i);
                actual.setHP(actual.getHP() + actual.getMaxHP()/10);
            }

        }catch(Exception e){
            System.out.println("Algo ocurrio mal con el healing");
        }
    }
}
