package pokemones;

import listas.ListaDE;
import movimientos.Movimientos;

public class tipoAire extends Mounstritos {

    private String[] debilidades;

    public tipoAire(String name, float HP, float maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo);

        this.debilidades = new String[]{"Roca","Agua"};
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
