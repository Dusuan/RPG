package pokemones;

import listas.ListaDE;
import listas.NodoDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {

    private ListaDE<String> debilidades;

    public tipoAgua(String name, float HP, float maxHP, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite, boolean vivo, ListaDE<String> debilidades) {
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
    public void AtaqueTipoEspecial() throws Exception {

        /*Potenciador
        if(getAtaques().empty()){
            return;
        }
        else {

            for(int i = 0; i< getDebilidades().size();i++) {
                if (getDebilidades().obtener(i)) {
                    int ataqueWow = getAtaque() * 5;
                    setAtaque(ataqueWow);

                }
            }

        }
            

    }


         */


    }
}
