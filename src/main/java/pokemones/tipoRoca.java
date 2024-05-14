package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoRoca extends Mounstritos {

    private String[] debilidades;

    public tipoRoca(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, float defense, int ataque, String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo,new String[]{"Agua", "Planta"});
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
