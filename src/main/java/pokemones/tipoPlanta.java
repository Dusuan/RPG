package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoPlanta extends Mounstritos {

    private String[] debilidades;
    public tipoPlanta(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, float defense, int ataque, String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo,new String[]{"Fuego", "Aire"});

    }

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String[] debilidades) {
        this.debilidades = debilidades;
    }

    @Override
    public void AtaqueTipoEspecial() {

    }
}
