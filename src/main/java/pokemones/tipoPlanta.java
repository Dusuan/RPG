package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoPlanta extends Mounstritos {

    public tipoPlanta(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, defense, sprite, vivo, debilidades);
    }

    @Override
    public int AtaqueTipoEspecial(int ataqueDefault) throws Exception {

        int ultimate = ataqueDefault * 5;
        return ultimate;
    }
}
