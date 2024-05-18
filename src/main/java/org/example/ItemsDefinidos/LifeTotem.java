package org.example.ItemsDefinidos;

import movimientos.Ataques;
import movimientos.Movimientos;
import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class LifeTotem extends Items {
    public LifeTotem(String nombre) {
        super(nombre);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
try {

    for(int i = 0 ; i < jugadorAfectado.getListaMounstritos().size(); i++){
        Mounstritos lol = jugadorAfectado.getListaMounstritos().obtener(i);
        if(!lol.isVivo()){
            lol.setHP(lol.getMaxHP());
            break;
        }
    }
}catch(Exception e){
    System.out.println("Algo ocurrio mal con LifeTotem");
}
    }
}
