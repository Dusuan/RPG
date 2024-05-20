package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class LifeTotem extends Items {
    public LifeTotem(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
try {
if(usado){
    System.out.println("Esta habilidad ya ha sido usada");
}
else {
    for (int i = 0; i < jugadorAfectado.getListaMounstritos().size(); i++) {
        Mounstritos lol = jugadorAfectado.getListaMounstritos().obtener(i);
        if (!lol.isVivo()) {
            lol.setHP(lol.getMaxHP());
            usado = true;
            break;
        }
    }
}
    System.out.println("Todos tus pokemones estan vivos!");
}catch(Exception e){
    System.out.println("Algo ocurrio mal con LifeTotem");
}
    }
}
