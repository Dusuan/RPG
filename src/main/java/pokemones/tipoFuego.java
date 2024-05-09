package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoFuego extends Mounstritos {

    private ListaDE<String> debilidades;

    public tipoFuego(String name, float HP, float maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo,ListaDE<String> debilidades) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo);

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
