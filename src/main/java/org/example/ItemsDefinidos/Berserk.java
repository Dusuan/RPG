package org.example.ItemsDefinidos;

import movimientos.Ataques;
import movimientos.Movimientos;
import org.example.Items;
import org.example.Jugador;
import pokemones.Mounstritos;

public class Berserk extends Items {
    public Berserk(String nombre, boolean usado) {
        super(nombre, usado);
    }
    public void UsarItem(Jugador jugadorAfectado, Jugador jugador2){
        try{
            if(usado){
                System.out.println("Esta habilidad ya ha sido usada");
            }else {
                Mounstritos Afectado = jugadorAfectado.getListaMounstritos().obtener(0);

                Afectado.setHP(Afectado.getHP() / 2);

                for (int i = 0; i < Afectado.getAtaques().size(); i++) {
                    Movimientos Ataque = Afectado.getAtaques().obtener(i);
                    if (Ataque instanceof Ataques) {
                        ((Ataques) Ataque).setDamage(((Ataques) Ataque).getDamage() * 1.5F);
                    }
                }
                usado = true;
            }
        }catch(Exception e){
            System.out.println("Error de obtener lista");
        }
    }
}
