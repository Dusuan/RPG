package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoAire extends Mounstritos {

    public tipoAire(String name, double HP, double maxHP, ListaDE<Movimientos> movimientosTotales, int ultimate, int defense, String sprite, boolean vivo) throws Exception {
        super(name, HP, maxHP, movimientosTotales, ultimate, defense, sprite, vivo);
    }

    @Override
    public String[] setDebilidades() {
        return new String[]{"Roca","Fuego"};
    }


}
