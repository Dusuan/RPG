package org.example;

import listas.ListaDE;
import pokemones.Mounstritos;

public class Jugador
{
    private String nombre;
    private ListaDE<Mounstritos> listaMounstritos;
    private ListaDE<Items> objetos;

    public Jugador(String nombre, ListaDE<Mounstritos> listaMounstritos, ListaDE<Items> objetos) {
        this.nombre = nombre;
        this.listaMounstritos = listaMounstritos;
        this.objetos = objetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaDE<Mounstritos> getListaMounstritos() {
        return listaMounstritos;
    }

    public void setListaMounstritos(ListaDE<Mounstritos> listaMounstritos) {
        this.listaMounstritos = listaMounstritos;
    }

    public ListaDE<Items> getObjetos() {
        return objetos;
    }

    public void setObjetos(ListaDE<Items> objetos) {
        this.objetos = objetos;
    }
}
