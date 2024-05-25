package pokemones;

import listas.ListaDE;
import listas.NodoDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {

    public tipoAgua(String name, double HP, double maxHP, ListaDE<Movimientos> movimientosTotales, int ultimate, int defense, String sprite, boolean vivo) throws Exception {
        super(name, HP, maxHP, movimientosTotales, ultimate, defense, sprite, vivo);
    }

    @Override
    public String[] setDebilidades() {
        return new String[]{"Planta","Aire"};
    } // Aqui se implementa el metodo en todas las clases hijas
}
