package org.example;

public abstract class Items {
    protected String nombre;

    public Items(String nombre){
        this.nombre = nombre;
    }
    public abstract void UsarItem(Jugador jugadorAplicando, Jugador jugadorRecibiendo);
}
