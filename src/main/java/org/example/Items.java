package org.example;

public abstract class Items {
    protected String nombre;
    protected boolean usado;
    public Items(String nombre, boolean usado){
        this.nombre = nombre;
        this.usado = false;
    }
    public abstract void UsarItem(Jugador jugadorAplicando, Jugador jugadorRecibiendo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
