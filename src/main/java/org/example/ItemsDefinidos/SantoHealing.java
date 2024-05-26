package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class SantoHealing extends Items {
    public SantoHealing(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        try {
            String LOGMESSAGE = "";
            if(usado){
                System.out.println("Esta habilidad ya ha sido usada");
            }else{
            for (int i = 0; i < jugadorAfectado.getListaMounstritos().size(); i++) {
                Mounstritos actual = jugadorAfectado.getListaMounstritos().obtener(i);
                if(actual.isVivo()){ // para evitar revivir pokemones
                actual.setHP(actual.getHP() + actual.getMaxHP()/10);
                }
            }
        usado = true;

            LOGMESSAGE = "El jugador "+jugadorAfectado.getNombre()+" ha curado a todos sus pokemones es un 10% !!!";


            }
        }catch(Exception e){
            System.out.println("Algo ocurrio mal con el healing");
        }
    }
}
