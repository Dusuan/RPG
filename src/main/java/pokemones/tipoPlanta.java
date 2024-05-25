package pokemones;


import listas.ListaDE;
import movimientos.Movimientos;

public class tipoPlanta extends Mounstritos {

    public tipoPlanta(String name, double HP, double maxHP, ListaDE<Movimientos> movimientosTotales, int ultimate, int defense, String sprite, boolean vivo) throws Exception {
        super(name, HP, maxHP, movimientosTotales, ultimate, defense, sprite, vivo);
    }

    @Override
    public String[] setDebilidades() {
        return new String[]{"Fuego","Aire"};
    }
}
