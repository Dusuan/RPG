package org.example.ItemsDefinidos;

import org.example.Items;
import org.example.Jugador;

public class VidaVoodo extends Items {
    public VidaVoodo(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
try{
    String LOGMESSAGE = "";
    if(usado){
        System.out.println("Esta habilidad ya ha sido usada");
    }else{
  double vida1 =  jugadorAfectado.getListaMounstritos().obtener(0).getHP();
  double vida2 =  jugador2.getListaMounstritos().obtener(0).getHP();

  jugadorAfectado.getListaMounstritos().obtener(0).setHP(vida2);
  jugador2.getListaMounstritos().obtener(0).setHP(vida1);
  usado = true;

        LOGMESSAGE = "El mounstrito "+ jugadorAfectado.getListaMounstritos().obtener(0)+ " de " +jugadorAfectado.getNombre()+ " ha cambiado su vida por la del mounstrito "+jugador2.getListaMounstritos().obtener(0) + " del jugador "+ jugador2.getNombre() ;


    }
}catch(Exception e) {
    System.out.println("Algo ocurrio mal con VidVoodoo");

       }

    }
}
