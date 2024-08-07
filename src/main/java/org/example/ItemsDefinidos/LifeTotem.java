package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

import static org.example.Duelo.registrarLog;

public class LifeTotem extends Items {
    public LifeTotem(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
try {
    String LOGMESSAGE = "";
if(usado){
    System.out.println("Esta habilidad ya ha sido usada");
}
else {
    for (int i = 0; i < jugadorAfectado.getListaMounstritos().size(); i++) {
        Mounstritos lol = jugadorAfectado.getListaMounstritos().obtener(i);
        if (!lol.isVivo()) {
            lol.setHP(lol.getMaxHP());
            usado = true;

            LOGMESSAGE = "El jugador "+jugadorAfectado.getNombre()+" ha revivido a "+lol.getName()+"!";
            registrarLog(LOGMESSAGE);

            break;
        }
    }
    if(!usado){
        System.out.println("Todos tus pokemones están vivos!");
    }

}
}catch(Exception e){
    System.out.println("Algo ocurrio mal con LifeTotem");
}
    }
}
