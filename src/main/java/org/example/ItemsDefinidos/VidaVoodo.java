package org.example.ItemsDefinidos;

import movimientos.Ataques;
import movimientos.Movimientos;
import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class VidaVoodo extends Items {
    public VidaVoodo(String nombre) {
        super(nombre);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
try{
  double vida1 =  jugadorAfectado.getListaMounstritos().obtener(0).getHP();
  double vida2 =  jugador2.getListaMounstritos().obtener(0).getHP();

  jugadorAfectado.getListaMounstritos().obtener(0).setHP(vida2);
  jugador2.getListaMounstritos().obtener(0).setHP(vida1);
}catch(Exception e) {
    System.out.println("Algo ocurrio mal con VidVoodoo");

       }

    }
}
