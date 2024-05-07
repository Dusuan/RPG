package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoPlanta extends Mounstritos {

    public tipoPlanta(String name, int HP, int ID, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite) {
        super(name, HP, ID, ataques, defense, ataque, sprite);
    }

    @Override
    public void AtaqueTipoEspecial() {

    }
}
