package pokemones;

import listas.ListaDE;
import listas.NodoDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {

    public tipoAgua(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int ultimate, int defense, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, ultimate, defense, sprite, vivo, new String[]{"Planta, Aire"});
    }



}
