package pokemones;

import listas.ListaDE;
import listas.NodoDE;
import movimientos.Movimientos;

public class tipoAgua extends Mounstritos {


    public tipoAgua(String name, double HP, double maxHP, ListaDE<Movimientos> ataques, int defense,String sprite, boolean vivo, String[] debilidades) {
        super(name, HP, maxHP, ataques, defense, sprite, vivo, debilidades);
    }

    @Override
    public int AtaqueTipoEspecial(int ataqueDefault) throws Exception {

        int ultimate = ataqueDefault * 5;

        return ultimate;


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
