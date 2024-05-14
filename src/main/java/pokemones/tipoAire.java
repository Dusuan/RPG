package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoAire extends Mounstritos {



    public tipoAire(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, float defense, int ataque, String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo, new String[]{"Roca","Fuego"});

    }



    @Override
    public void AtaqueTipoEspecial() {


    }
}
