package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoFuego extends Mounstritos {

    private String[] debilidades;

    public tipoFuego(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo, new String[] {"Agua", "Roca"});
    }


    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String [] debilidades) {
        this.debilidades = debilidades;
    }

    @Override
    public void AtaqueTipoEspecial() {

    }


}
