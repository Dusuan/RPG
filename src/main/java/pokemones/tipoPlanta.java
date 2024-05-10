package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoPlanta extends Mounstritos {

    private String[] debilidades;
    public tipoPlanta(String name, float HP, float maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo,String [] debilidades) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo);

        this.debilidades = new String[]{"Fuego", "Aire"};
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
