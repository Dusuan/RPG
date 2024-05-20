package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoFuego extends Mounstritos {


    public tipoFuego(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int ultimate, int defense, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, ultimate, defense, sprite, vivo, new String[]{"Agua","Roca"});
    }
}
