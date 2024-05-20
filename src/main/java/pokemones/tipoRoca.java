package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoRoca extends Mounstritos {

    public tipoRoca(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int ultimate, int defense, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, ultimate, defense, sprite, vivo, new String[]{"Agua","Planta"});
    }
}
