package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoFuego extends Mounstritos {

    private ListaDE<String> debilidades;

    public tipoFuego(String name, float HP,ListaDE<Movimientos> ataques, int defense, int ataque, String sprite,ListaDE<String> debiliades) {
        super(name, HP,ataques, defense, ataque, sprite);
        this.debilidades = debiliades;
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
