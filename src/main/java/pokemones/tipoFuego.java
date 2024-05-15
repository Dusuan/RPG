package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoFuego extends Mounstritos {

    public tipoFuego(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo, debilidades);
    }

    @Override
    public void AtaqueTipoEspecial() throws Exception {

        int ultimate = getAtaque() * 2;
        setAtaque(ultimate);

    }
}
