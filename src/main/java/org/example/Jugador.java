package org.example;

import listas.ListaDE;
import pokemones.Mounstritos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Jugador
{
    private String nombre;
    private ListaDE<Mounstritos> listaMounstritos;
    private ListaDE<Items> objetos;

    public Jugador(String nombre, ListaDE<Mounstritos> listaMounstritos, ListaDE<Items> Itemstotales) throws Exception {
        this.nombre = nombre;
        this.listaMounstritos = listaMounstritos;
        this.objetos = new ListaDE<>();


        Random random = new Random();
        Set<Integer> itemSeleccionado = new HashSet<>(); // es exactamente lo que Emiliano hizo en Mounstritos con los ataques, pero ahora con los items

        while (objetos.size() < 2) {
            if (Itemstotales.empty()) {
                break;
            }
            int index = random.nextInt(Itemstotales.size());

            if (!itemSeleccionado.contains(index)) {
                objetos.adicionar(Itemstotales.obtener(index));
                itemSeleccionado.add(index);
            }
        }
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
