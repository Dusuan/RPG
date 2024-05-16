package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoAire extends Mounstritos {

    public tipoAire(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense,String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, sprite, vivo, new String[]{"Roca","Fuego"});

    }

    @Override
    public int AtaqueTipoEspecial(int ataqueDefault) throws Exception {

        int ultimate =ataqueDefault * 5;
        return ultimate;
    }
}
