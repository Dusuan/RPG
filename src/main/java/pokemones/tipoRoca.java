package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoRoca extends Mounstritos {

    public tipoRoca(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo, debilidades);
    }

    @Override
    public void AtaqueTipoEspecial() throws Exception {
        int newAtaque = getAtaque() * 5;
        setAtaque(newAtaque);
    }
}
