package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {

    private ListaDE<String> debilidades;

    public tipoAgua(String name, int HP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite,ListaDE<String> debilidades) {
        super(name, HP,ataques, defense, ataque, sprite);
        this.debilidades = debilidades;
    }

    public ListaDE<String> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(ListaDE<String> debilidades) {
        this.debilidades = debilidades;
    }

    @Override
    public void AtaqueTipoEspecial() {

    }
}
