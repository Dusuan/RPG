package pokemones;

import listas.ListaDE;
import listas.NodoDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {


    public tipoAgua(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, float defense, int ataque, String sprite, boolean vivo) {
        super(name, HP, maxHP, ataques, defense, ataque, sprite, vivo, new String[]{"Planta", "Aire"});
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
