package org.example;

import listas.ListaDE;

public class tipoRoca extends Mounstritos{
    public tipoRoca(String name, int HP, int ID, ListaDE<Movimientos> ataques, int defense, int ataque, String sprite) {
        super(name, HP, ID, ataques, defense, ataque, sprite);
    }

    @Override
    public void AtaqueTipoEspecial() {

    }
}
